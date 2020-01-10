import { TestBed } from '@angular/core/testing';

import { InventionsService } from './inventions.service';

describe('InventionsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: InventionsService = TestBed.get(InventionsService);
    expect(service).toBeTruthy();
  });
});
