import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CompanyServicePageComponent } from './company-service-page.component';

describe('CompanyServicePageComponent', () => {
  let component: CompanyServicePageComponent;
  let fixture: ComponentFixture<CompanyServicePageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CompanyServicePageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CompanyServicePageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
