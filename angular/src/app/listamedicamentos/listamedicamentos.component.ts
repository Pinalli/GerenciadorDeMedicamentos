import { Component, OnInit } from '@angular/core';
import { MedicamentosService } from '../services/medicamentos.service';

@Component({
  selector: 'app-medicamentos',
  templateUrl: './listamedicamentos.component.html',
  styleUrls: ['./listamedicamentos.component.sass']
})
export class ListamedicamentosComponent implements OnInit {

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
