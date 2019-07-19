package com.alanlapierre.timexp.checker;

import java.time.LocalDate;
import java.time.MonthDay;

public class YearlyTimeRecurrency extends TimeRecurrency {
	
	private Integer step;
	
	public YearlyTimeRecurrency(Integer step, int year, MonthDay monthDay) {
		super();
		this.step = step;
		this.dateFrom = LocalDate.of(year,monthDay.getMonth(), monthDay.getDayOfMonth());;
	}

	public Integer getStep() {
		return step;
	}

	public void setStep(Integer step) {
		this.step = step;
	}
	
	

}
