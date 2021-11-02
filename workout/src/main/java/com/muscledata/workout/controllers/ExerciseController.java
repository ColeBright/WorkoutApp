package com.muscledata.workout.controllers;

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
import com.muscledata.workout.repositories.ExerciseRepository;

@RestController
@RequestMapping("/api/v1/workouts/exercises")
public class ExerciseController {
	@Autowired
	private ExerciseRepository exerciseRepository;

	@GetMapping
	public List<Exercise> list(){
		return exerciseRepository.findAll();
		
	}
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Exercise exercise) {
		exerciseRepository.save(exercise);
		
	}
	@GetMapping("/{id}")
	public Exercise get(@PathVariable("id") long id) {
		//
		return exerciseRepository.getOne(id);
	}

}
