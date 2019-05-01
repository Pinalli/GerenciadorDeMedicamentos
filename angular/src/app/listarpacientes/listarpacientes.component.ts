import { Component, OnInit } from '@angular/core';
import { PacienteService } from '../services/paciente.service';
import { HistoricoService } from '../services/historico.service';

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
      
      medicar(paciente: any) {
        this.HistoricoService.medicar(paciente);
      }
    }


