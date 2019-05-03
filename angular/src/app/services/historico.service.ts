import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { retry, catchError } from 'rxjs/operators';
import { Observable, throwError } from 'rxjs';
import { Historico } from '../shared/historico';


@Injectable({
    providedIn: 'root'
})
export class HistoricoService {

    apiURL = 'http://localhost:8080/gerenciadorMedicamentos/rest/historico/';

    constructor(private http: HttpClient) { }

    httpOptions = {
        headers: new HttpHeaders({
            'Content-Type': 'application/json'
        })
    };

    Listahistorico() {
        return this.http.get('http://localhost:8080/gerenciadorMedicamentos/rest/historico/list/');
    }

    criarHistorico(historico): Observable<Historico> {
        const headers = new HttpHeaders();
        headers.append('Accept', 'application/json');
        headers.append('Content-Type', 'application/json');

        return this.http.post<Historico>(this.apiURL + 'add',
         JSON.stringify(historico), { headers }).
            pipe(
                retry(1), catchError(this.handleError));
    }

    handleError(error) {
        let errorMessage = '';
        if (error.error instanceof ErrorEvent) {
            // Get client-side error
            errorMessage = error.error.message;
        } else {
            // Get server-side error
            errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
        }
        window.alert(errorMessage);
        return throwError(errorMessage);
    }
}

