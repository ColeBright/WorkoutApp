package com.muscledata.workout.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muscledata.workout.models.Workout;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {


}
