import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PostSimulatorComponent } from './post-simulator.component';

describe('PostSimulatorComponent', () => {
  let component: PostSimulatorComponent;
  let fixture: ComponentFixture<PostSimulatorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PostSimulatorComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PostSimulatorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
