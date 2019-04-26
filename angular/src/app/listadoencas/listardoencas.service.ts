import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ListardoencasService {

  constructor(private http: HttpClient) {}

  listarDoencas() {
      return this.http.get('http://localhost:8080/gerenciadorMedicamentos/rest/doencas/list/');
  }
}
