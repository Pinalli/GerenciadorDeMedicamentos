import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpRequest } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class HistoricoService {



  constructor(private http: HttpClient) {}

  Listahistorico() {
      return this.http.get('http://localhost:8080/gerenciadorMedicamentos/rest/historico/read/');
    }

    }
