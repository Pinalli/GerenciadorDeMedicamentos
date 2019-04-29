import { Component, OnInit } from '@angular/core';
import { HistoricoService } from '../services/historico.service';

@Component({
    selector: 'app-listahistorico',
    templateUrl: './listahistorico.component.html',
    styleUrls: ['./listahistorico.component.sass']
})
export class ListahistoricoComponent implements OnInit {

    historico: any = [];
    constructor(private service: HistoricoService) { }

    ngOnInit() {
        this.service.Listahistorico().subscribe(
            (data: any) => {
                const results = data;
                for (const historico of results) {
                    this.historico.push(historico);
                }
            }
        );
    }
}
