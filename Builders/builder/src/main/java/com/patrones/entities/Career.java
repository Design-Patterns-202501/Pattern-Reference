package com.patrones.entities;

public class Career {
    private String name;
    private int semesters;


    public Career(String name, int sem) {
        this.name = name;
        this.semesters = sem;
    }

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSemesters() {
		return semesters;
	}
	public void setSemesters(int semesters) {
		this.semesters = semesters;
	}
};
