import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ComponentAngularComponent } from './component-angular.component';

describe('ComponentAngularComponent', () => {
  let component: ComponentAngularComponent;
  let fixture: ComponentFixture<ComponentAngularComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ComponentAngularComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ComponentAngularComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
