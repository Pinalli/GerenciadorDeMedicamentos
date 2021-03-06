import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ListadoencasComponent } from './listadoencas/listadoencas.component';
import { HttpClientModule } from '@angular/common/http';

import { RouterModule, Routes } from '@angular/router';
import { ListamedicamentosComponent } from './listamedicamentos/listamedicamentos.component';
import { DoencasService } from './services/doencas.service';
import { MedicamentosService } from './services/medicamentos.service';

import { ListarpacientesComponent } from './listarpacientes/listarpacientes.component';
import { PacienteService } from './services/paciente.service';

import { ListahistoricoComponent } from './listahistorico/listahistorico.component';
import { HistoricoService } from './services/historico.service';


const appRoutes: Routes = [
    {path: 'doencas/list', component: ListadoencasComponent},
    {path: 'medicamentos/list', component: ListamedicamentosComponent},
    {path: 'pacientes/list', component: ListarpacientesComponent},
    {path: 'historico/list', component: ListahistoricoComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    ListadoencasComponent,
    ListamedicamentosComponent,
    ListarpacientesComponent,
    ListahistoricoComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    )
  ],

  providers: [DoencasService, MedicamentosService, PacienteService, HistoricoService],

  bootstrap: [AppComponent]
})
export class AppModule { }
