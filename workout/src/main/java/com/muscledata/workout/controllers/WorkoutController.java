package com.muscledata.workout.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.muscledata.workout.models.Exercise;
import com.muscledata.workout.models.Workout;
import com.muscledata.workout.repositories.ExerciseRepository;
import com.muscledata.workout.repositories.WorkoutRepository;

@RestController
@RequestMapping("/api/v1/workouts")
public class WorkoutController {
	@Autowired
	private WorkoutRepository workoutRepository;
	private ExerciseRepository exerciseRepository;

	@GetMapping
	public List<Workout> list(){
		return workoutRepository.findAll();
		
	}
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Workout workout) {
		
//		List<Exercise> exercises = workout.getExercises();
//		exerciseRepository.saveAll(exercises);
		workoutRepository.save(workout);
		
	}
	@GetMapping("/{id}")
	public Workout get(@PathVariable("id") long id) {
		return workoutRepository.getOne(id);

	}
}
