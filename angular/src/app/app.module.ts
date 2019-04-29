import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ListadoencasComponent } from './listadoencas/listadoencas.component';
import { ListardoencasService } from './listadoencas/listardoencas.service';
import { HttpClientModule } from '@angular/common/http';

import { RouterModule, Routes } from '@angular/router';
import { MedicamentosComponent } from './medicamentos/medicamentos.component';
import { MedicamentosService } from './medicamentos/medicamentos.service';

const appRoutes: Routes = [
    {path: 'doencas/list', component: ListadoencasComponent},
    {path: 'medicamentos/list', component: MedicamentosComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    ListadoencasComponent,
    MedicamentosComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    )
  ],
  providers: [ListardoencasService, MedicamentosService],
  bootstrap: [AppComponent]
})
export class AppModule { }
