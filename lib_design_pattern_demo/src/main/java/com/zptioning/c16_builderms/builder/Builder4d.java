package com.zptioning.c16_builderms.builder;

import com.zptioning.c16_builderms.vacation.Vacation;

public class Builder4d extends AbsBuilder {

	public Builder4d(String std) {
		super(std);
		// TODO Auto-generated constructor stub

	}

	@Override
	public void buildDay(int i) {


		mVacation.setVacationDay(i);

	}

	@Override
	public void addHotel(String hotel) {

		mVacation.setHotel(hotel);
	}

	@Override
	public void addTicket(String ticket) {

		mVacation.addTicket(ticket);
	}

	@Override
	public void addEvent(String event) {

		mVacation.addEvent(event);
	}

	@Override
	public void buildvacation() {

		addTicket("Plane Ticket");
		addEvent("Fly to Destination");
		addEvent("Supper");
		addHotel("Hilton");

		mVacation.addDay();
		addTicket("Zoo Ticket");
		addEvent("Bus to Zoo");
		addEvent("Feed animals");
		addHotel("Hilton");

		mVacation.addDay();
		addTicket("Beach");
		addEvent("Swimming");
		addHotel("Home inn");

		mVacation.addDay();
		addTicket("Plane Ticket");
		addEvent("Fly to Home");
	}

}
