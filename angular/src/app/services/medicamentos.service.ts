import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MedicamentosService {

  constructor(private http: HttpClient) { }

  listarMedicamentos() {
      return this.http.get('http://localhost:8080/gerenciadorMedicamentos/rest/medicamentos/list/');
  }
}
