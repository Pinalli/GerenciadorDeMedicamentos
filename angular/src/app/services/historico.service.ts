import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ListahistoricoComponent } from '../listahistorico/listahistorico.component';

@Injectable({
  providedIn: 'root'
})
export class HistoricoService {

  constructor(private http: HttpClient) {}

  Listahistorico() {
      return this.http.get('http://localhost:8080/gerenciadorMedicamentos/rest/historico/list/');
    }
}
