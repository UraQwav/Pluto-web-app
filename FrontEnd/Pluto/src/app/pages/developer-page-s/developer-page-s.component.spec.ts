import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeveloperPageSComponent } from './developer-page-s.component';

describe('DeveloperPageSComponent', () => {
  let component: DeveloperPageSComponent;
  let fixture: ComponentFixture<DeveloperPageSComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeveloperPageSComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeveloperPageSComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
