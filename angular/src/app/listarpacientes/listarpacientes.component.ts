import { Component, OnInit } from '@angular/core';
import { PacienteService } from '../services/paciente.service';
import { Historico } from '../shared/historico';

@Component({
    selector: 'app-listarpacientes',
    templateUrl: './listarpacientes.component.html',
    styleUrls: ['./listarpacientes.component.sass']
})
export class ListarpacientesComponent implements OnInit {

    pacientes: any = [];

    constructor(private service: PacienteService) { }

    ngOnInit() {
        this.service.listarPacientes().subscribe(
            (data: any) => {
                const results = data;
                for (const paciente of results) {
                    this.pacientes.push(paciente);
                }
            }
        );

    }
    aplicaMedicamento(paciente: any) {
        debugger;
        const historicoTela = {} as Historico;

        historicoTela.idDoenca = paciente.doenca_1;
        historicoTela.idPaciente = paciente.id;
        historicoTela.idMedicamento = paciente.medicamento_1;

        this.service.aplicarMedicamento(historicoTela);
    }

}
