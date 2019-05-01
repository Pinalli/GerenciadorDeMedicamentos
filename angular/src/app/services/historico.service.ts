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
      return this.http.get('http://localhost:8080/gerenciadorMedicamentos/rest/historico/list/');
    }

    medicar(paciente: any) {
      const bodyString = JSON.stringify(paciente);
      const cabecalho = new Headers({'Content-Type': 'application/json'});
      const options = new RequestOptions({headers: cabecalho});

      return this.http.post('localhost:8080/gerenciadorMedicamentos/rest/historico/add', bodyString, options)
      .map( (res:Response) => {} )
      .catch( (error:any) => Observable.throw(error));
        // this.pessoas.push(pessoa);
  }
    }
}
