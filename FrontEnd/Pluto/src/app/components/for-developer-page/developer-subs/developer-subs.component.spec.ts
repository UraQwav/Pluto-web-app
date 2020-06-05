import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeveloperSubsComponent } from './developer-subs.component';

describe('DeveloperSubsComponent', () => {
  let component: DeveloperSubsComponent;
  let fixture: ComponentFixture<DeveloperSubsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeveloperSubsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeveloperSubsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
