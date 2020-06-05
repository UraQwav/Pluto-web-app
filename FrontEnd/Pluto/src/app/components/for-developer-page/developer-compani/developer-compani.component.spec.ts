import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeveloperCompaniComponent } from './developer-compani.component';

describe('DeveloperCompaniComponent', () => {
  let component: DeveloperCompaniComponent;
  let fixture: ComponentFixture<DeveloperCompaniComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeveloperCompaniComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeveloperCompaniComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
