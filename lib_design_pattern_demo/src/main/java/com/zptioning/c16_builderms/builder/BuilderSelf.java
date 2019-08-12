package com.zptioning.c16_builderms.builder;

import com.zptioning.c16_builderms.vacation.Vacation;

public class BuilderSelf {
	public Vacation mVacation;

	public BuilderSelf(String std) {
		mVacation = new Vacation(std);
		// TODO Auto-generated constructor stub

	}

	public BuilderSelf addDay() {


		mVacation.addDay();
		return this;
	}

	public BuilderSelf buildDay(int i) {


		mVacation.setVacationDay(i);
		return this;
	}

	public BuilderSelf addHotel(String hotel) {

		mVacation.setHotel(hotel);
		return this;
	}

	public BuilderSelf addTicket(String ticket) {

		mVacation.addTicket(ticket);
		return this;
	}

	public BuilderSelf addEvent(String event) {

		mVacation.addEvent(event);
		return this;
	}

	public Vacation getVacation() {

		return mVacation;

	}
}
