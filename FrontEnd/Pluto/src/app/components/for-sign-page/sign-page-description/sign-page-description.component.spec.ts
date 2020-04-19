import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SignPageDescriptionComponent } from './sign-page-description.component';

describe('SignPageDescriptionComponent', () => {
  let component: SignPageDescriptionComponent;
  let fixture: ComponentFixture<SignPageDescriptionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SignPageDescriptionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SignPageDescriptionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
