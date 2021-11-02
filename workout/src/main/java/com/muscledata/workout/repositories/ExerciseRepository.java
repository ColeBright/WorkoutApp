package com.muscledata.workout.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.muscledata.workout.models.Exercise;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

}
