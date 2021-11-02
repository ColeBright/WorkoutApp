package com.muscledata.workout.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="exercise")
public class Exercise {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="exerciseId")
	private Long id;
	private Muscle muscle;
	public Muscle getMuscle() {
		return muscle;
	}
	public void setMuscle(Muscle muscle) {
		this.muscle = muscle;
	}
	private String name;
	private Integer weight;
	private Integer reps;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Integer getReps() {
		return reps;
	}
	public void setReps(Integer reps) {
		this.reps = reps;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
