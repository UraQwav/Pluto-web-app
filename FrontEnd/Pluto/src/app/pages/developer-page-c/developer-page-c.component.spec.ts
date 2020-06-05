import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeveloperPageCComponent } from './developer-page-c.component';

describe('DeveloperPageCComponent', () => {
  let component: DeveloperPageCComponent;
  let fixture: ComponentFixture<DeveloperPageCComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeveloperPageCComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeveloperPageCComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
