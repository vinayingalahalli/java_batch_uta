import { TestBed } from '@angular/core/testing';

import { AnimalServiceService } from './animal-service.service';

describe('AnimalServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AnimalServiceService = TestBed.get(AnimalServiceService);
    expect(service).toBeTruthy();
  });
});
