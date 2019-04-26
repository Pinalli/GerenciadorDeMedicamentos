import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ListadoencasComponent } from './listadoencas/listadoencas.component';
import { ListardoencasService } from './listadoencas/listardoencas.service';
import { HttpClientModule } from '@angular/common/http';

import { RouterModule, Routes } from '@angular/router';

const appRoutes: Routes = [
    {path: 'doencas/list', component: ListadoencasComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    ListadoencasComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    )
  ],
  providers: [ListardoencasService],
  bootstrap: [AppComponent]
})
export class AppModule { }
