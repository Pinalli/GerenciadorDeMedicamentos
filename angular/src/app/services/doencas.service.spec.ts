import { TestBed } from '@angular/core/testing';

import { ListardoencasService } from './listardoencas.service';

describe('ListardoencasService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ListardoencasService = TestBed.get(ListardoencasService);
    expect(service).toBeTruthy();
  });
});
