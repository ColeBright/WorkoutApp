import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Observable } from 'rxjs';
import { WorkoutService } from 'src/app/services/workout.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  muscles: string[] = [
    'CHEST', 'BACK', 'ABS', 'QUADS', 'HAMSTRINGS', 'ADDUCTORS', 'ABDUCTORS', 'REARDELTS', 
    'FRONTDELTS', 'LATERALDELTS', 'BICEPS', 'TRICEPS', 'CALVES'
  ];
  workoutform: FormGroup;
  validMessage: string = "";


  constructor(private workoutService : WorkoutService) { }

  ngOnInit(): void {
    this.workoutform = new FormGroup({
      date: new FormControl('', Validators.required),
      name: new FormControl('', Validators.required),
      muscle: new FormControl('', Validators.required),
      weight: new FormControl('', Validators.required),
      reps: new FormControl('', Validators.required),
    });
  }

  submitRegistration() {
    if (this.workoutform.valid) {
      this.validMessage = "Your workout has been logged!";
      this.workoutService.createWorkout(this.workoutform.value).subscribe(
        data => {
          this.workoutform.reset();
          return true;
        },
        error => {
          return Observable.throw(error);
        }
      )
    } else {
      this.validMessage = "Complete form before completing.";
    }
  }

}
