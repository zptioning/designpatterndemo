package com.zptioning.c16_builderms.builder;

import com.zptioning.c16_builderms.vacation.Vacation;

public class Builder3d extends AbsBuilder {

	public Builder3d(String std) {
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
		addEvent("Dancing");
		addHotel("Four Seasons");

		mVacation.addDay();
		addTicket("Theme Park");
		addEvent("Bus to Park");
		addEvent("lunch");
		addHotel("Four Seasons");

		mVacation.addDay();

		addTicket("Plane Ticket");
		addEvent("City Tour");
		addEvent("Fly to Home");

	}

}
