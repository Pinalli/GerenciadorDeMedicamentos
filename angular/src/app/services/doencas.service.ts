import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Doenca } from '../classes/Doenca';
import { retry } from 'rxjs/operators';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DoencasService {

  private baseUrl = 'http://localhost:8080/gerenciadorMedicamentos/rest/doenca/';
  constructor(private http: HttpClient) {}


  read() {
      return this.http.get<Doenca[]>(this.baseUrl + 'read').pipe( retry(1) );
  }

  readById(id: number) {
    return this.http.get(this.baseUrl + 'read/' + id.toString());
  }

  create(d: Doenca): Observable<boolean> {
    return this.http.post<boolean>(this.baseUrl + 'create', d);
  }

  delete(d: Doenca): Observable<boolean>{
    return this.http.delete<boolean>(this.baseUrl + 'delete/' + d.id.toString());
  }
}
