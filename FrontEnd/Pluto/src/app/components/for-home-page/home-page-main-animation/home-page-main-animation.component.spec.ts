import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomePageMainAnimationComponent } from './home-page-main-animation.component';

describe('HomePageMainAnimationComponent', () => {
  let component: HomePageMainAnimationComponent;
  let fixture: ComponentFixture<HomePageMainAnimationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HomePageMainAnimationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomePageMainAnimationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
