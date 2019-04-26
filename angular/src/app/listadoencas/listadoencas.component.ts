import { Component, OnInit } from '@angular/core';
import { ListardoencasService } from './listardoencas.service';

@Component({
  selector: 'app-listadoencas',
  templateUrl: './listadoencas.component.html',
  styleUrls: ['./listadoencas.component.sass']
})
export class ListadoencasComponent implements OnInit {

    doencas: any = [];

  constructor(private service: ListardoencasService) { }

  ngOnInit() {
      this.service.listarDoencas().subscribe(
          (data: any) => {
        const results = data;
        for (const doenca of results) {
            this.doencas.push(doenca);
            }
        }
      );
  }

}
