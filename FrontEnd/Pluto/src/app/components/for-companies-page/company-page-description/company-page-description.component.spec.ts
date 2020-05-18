import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CompanyPageDescriptionComponent } from './company-page-description.component';

describe('CompanyPageDescriptionComponent', () => {
  let component: CompanyPageDescriptionComponent;
  let fixture: ComponentFixture<CompanyPageDescriptionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CompanyPageDescriptionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CompanyPageDescriptionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
