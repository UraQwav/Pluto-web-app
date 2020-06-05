import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PopularSubsPageComponent } from './popular-subs-page.component';

describe('PopularSubsPageComponent', () => {
  let component: PopularSubsPageComponent;
  let fixture: ComponentFixture<PopularSubsPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PopularSubsPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PopularSubsPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
