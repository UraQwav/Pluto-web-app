import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CompanyServicePageDescriptionComponent } from './company-service-page-description.component';

describe('CompanyServicePageDescriptionComponent', () => {
  let component: CompanyServicePageDescriptionComponent;
  let fixture: ComponentFixture<CompanyServicePageDescriptionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CompanyServicePageDescriptionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CompanyServicePageDescriptionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
