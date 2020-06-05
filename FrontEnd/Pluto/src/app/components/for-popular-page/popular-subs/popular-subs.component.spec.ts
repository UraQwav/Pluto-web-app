import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PopularSubsComponent } from './popular-subs.component';

describe('PopularSubsComponent', () => {
  let component: PopularSubsComponent;
  let fixture: ComponentFixture<PopularSubsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PopularSubsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PopularSubsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
