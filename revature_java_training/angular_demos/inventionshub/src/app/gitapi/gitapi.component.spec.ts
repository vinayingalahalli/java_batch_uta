import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GitapiComponent } from './gitapi.component';

describe('GitapiComponent', () => {
  let component: GitapiComponent;
  let fixture: ComponentFixture<GitapiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GitapiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GitapiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
