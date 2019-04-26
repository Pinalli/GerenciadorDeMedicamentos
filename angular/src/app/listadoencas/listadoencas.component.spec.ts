import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListadoencasComponent } from './listadoencas.component';

describe('ListadoencasComponent', () => {
  let component: ListadoencasComponent;
  let fixture: ComponentFixture<ListadoencasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListadoencasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListadoencasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
