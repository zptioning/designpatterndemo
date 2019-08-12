package com.zptioning.c23_visitor.mode;

public class CompensationVisitor implements Visitor {

	@Override
	public void Visit(Element element) {

		Employee employee = ((Employee) element);

		System.out.println(employee.getName() + "'s Compensation is "
				+ (employee.getDegree() * employee.getVacationDays() * 10));
	}

}
