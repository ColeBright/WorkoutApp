import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json'})
};

@Injectable({
  providedIn: 'root'
})
export class WorkoutService {

  constructor(private http:HttpClient) { }

  getWorkouts() {
    return this.http.get('/server/api/v1/workouts');
  }

  getWorkout(id: number) { 
    return this.http.get('/server/api/v1/workouts/' + id);
  }

  createWorkout(workout) {
    let body = JSON.stringify(workout);
    return this.http.post('/server/api/v1/workouts', body, httpOptions);
  }
}
