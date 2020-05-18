import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CompaniesAddServicesComponent } from './companies-add-services.component';

describe('CompaniesAddServicesComponent', () => {
  let component: CompaniesAddServicesComponent;
  let fixture: ComponentFixture<CompaniesAddServicesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CompaniesAddServicesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CompaniesAddServicesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
