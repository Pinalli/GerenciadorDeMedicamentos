import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { ListamedicamentosComponent } from './listamedicamentos.component';


describe('MedicamentosComponent', () => {
  let component: ListamedicamentosComponent;
  let fixture: ComponentFixture<ListamedicamentosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListamedicamentosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListamedicamentosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
