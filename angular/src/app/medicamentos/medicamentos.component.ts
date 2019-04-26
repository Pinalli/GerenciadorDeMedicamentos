import { Component, OnInit } from '@angular/core';
import { MedicamentosService } from './medicamentos.service';

@Component({
  selector: 'app-medicamentos',
  templateUrl: './medicamentos.component.html',
  styleUrls: ['./medicamentos.component.sass']
})
export class MedicamentosComponent implements OnInit {

    medicamentos: any = [];
  constructor(private service: MedicamentosService) { }

  ngOnInit() {
      this.service.listarMedicamentos().subscribe(
          (data: any) => {
              const results = data;
              for (const medicamento of results) {
                  this.medicamentos.push(medicamento);
              }
          }
      );
  }

}
