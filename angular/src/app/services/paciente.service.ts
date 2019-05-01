import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Historico } from '../shared/historico';
import { HistoricoService } from './historico.service';

@Injectable({
    providedIn: 'root'
})
export class PacienteService {

    constructor(private http: HttpClient, private servicoHistorico: HistoricoService) { }

    listarPacientes() {
        return this.http.get('http://localhost:8080/gerenciadorMedicamentos/rest/pacientes/read/');
    }

    aplicarMedicamento(historico: Historico) {
        this.servicoHistorico.criarHistorico(historico);
    }
}
