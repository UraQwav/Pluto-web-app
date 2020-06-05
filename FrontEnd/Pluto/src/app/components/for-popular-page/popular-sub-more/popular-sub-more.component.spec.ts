import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PopularSubMoreComponent } from './popular-sub-more.component';

describe('PopularSubMoreComponent', () => {
  let component: PopularSubMoreComponent;
  let fixture: ComponentFixture<PopularSubMoreComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PopularSubMoreComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PopularSubMoreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
