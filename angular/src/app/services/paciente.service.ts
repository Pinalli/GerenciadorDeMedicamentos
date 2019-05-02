import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Historico } from '../shared/historico';
import { HistoricoService } from './historico.service';
import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';

@Injectable({
    providedIn: 'root'
})
export class PacienteService {

    constructor(private http: HttpClient, private servicoHistorico: HistoricoService) { }

    apiURL = 'localhost:8080/gerenciadorMedicamentos/rest/historico/';

    listarPacientes() {
        return this.http.get('http://localhost:8080/gerenciadorMedicamentos/rest/pacientes/read/');
    }

    aplicarMedicamento(historico: Historico) {
       this.servicoHistorico.criarHistorico(historico).subscribe(x => console.log(x));
    }

    // aplicarMedicamento(historico): Observable<Historico> {
    //     return this.http.post<Historico>(this.apiURL + 'add', JSON.stringify(historico)).
    //         pipe(
    //             retry(1), catchError(this.handleError))
    // }

    // handleError(error) {
    //     let errorMessage = '';
    //     if (error.error instanceof ErrorEvent) {
    //         // Get client-side error
    //         errorMessage = error.error.message;
    //     } else {
    //         // Get server-side error
    //         errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    //     }
    //     window.alert(errorMessage);
    //     return throwError(errorMessage);
    // }

}
