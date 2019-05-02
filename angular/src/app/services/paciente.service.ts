import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root'
})
export class PacienteService {

    constructor(private http: HttpClient) { }

    listarPacientes() {
        return this.http.get('http://localhost:8080/gerenciadorMedicamentos/rest/pacientes/read');
    }
}
