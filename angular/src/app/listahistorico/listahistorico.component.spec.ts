import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListahistoricoComponent } from './listahistorico.component';

describe('ListahistoricoComponent', () => {
  let component: ListahistoricoComponent;
  let fixture: ComponentFixture<ListahistoricoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListahistoricoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListahistoricoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
