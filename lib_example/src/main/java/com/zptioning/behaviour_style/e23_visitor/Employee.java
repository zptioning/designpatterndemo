package com.zptioning.behaviour_style.e23_visitor;

public class Employee extends Element {

	private String name;
	private float income;
	private int vacationDays;
	private int degree;

	public Employee(String name, float income, int vacationDays, int degree) {
		this.name = name;
		this.income = income;
		this.vacationDays = vacationDays;
		this.degree = degree;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setIncome(float income) {
		this.income = income;
	}

	public float getIncome() {
		return income;
	}

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	public int getDegree() {
		return degree;
	}

	@Override
	public void Accept(Visitor visitor) {

		visitor.Visit(this);
	}

}
