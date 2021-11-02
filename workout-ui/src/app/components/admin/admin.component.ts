import { Component, OnInit } from '@angular/core';
import { WorkoutService } from 'src/app/services/workout.service';
@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
public workouts;
public exercises;

  constructor(private workoutService : WorkoutService) { }

  ngOnInit(): void {
    this.getWorkouts();
  }

  getWorkouts() {
    this.workoutService.getWorkouts().subscribe(
      data => { this.workouts = data },
      err => console.log(err),
      () => console.log('workouts loaded')
    );
  }
}
