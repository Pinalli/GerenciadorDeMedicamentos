import { Component, OnInit } from '@angular/core';
import { DoencasService } from '../services/doencas.service';
import { Doenca } from '../classes/Doenca';

@Component({
  selector: 'app-listadoencas',
  templateUrl: './listadoencas.component.html',
  styleUrls: ['./listadoencas.component.sass']
})
export class ListadoencasComponent implements OnInit {

    doencas: Doenca[] = [];

  constructor(private service: DoencasService) { }

  ngOnInit() {
      this.service.read().subscribe(
          (data: Doenca[]) => { this.doencas = data; }
      );
  }

  delete(doenca: Doenca) {
    this.service.delete(doenca).subscribe();
  }

}
