import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeveloperProfilesComponent } from './developer-profiles.component';

describe('DeveloperProfilesComponent', () => {
  let component: DeveloperProfilesComponent;
  let fixture: ComponentFixture<DeveloperProfilesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeveloperProfilesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeveloperProfilesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
