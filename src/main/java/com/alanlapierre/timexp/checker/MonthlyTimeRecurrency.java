package com.alanlapierre.timexp.checker;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;

import com.alanlapierre.timexp.utils.DateUtils;

public class MonthlyTimeRecurrency extends TimeRecurrency {

	private Integer step;
	
	private YearMonth yearMonth;
	private DayOfWeek dayOfWeek;
	private Integer weekInMonth;


	public MonthlyTimeRecurrency(LocalDate dateFrom, Integer step) {
		super(dateFrom);
		this.step = step;
	}
	
	public MonthlyTimeRecurrency(Integer step, YearMonth yearMonth, DayOfWeek dayOfWeek, Integer weekInMonth) {
		super();
		this.dateFrom = generateDate(yearMonth, dayOfWeek, weekInMonth);
		this.step = step;
		this.yearMonth = yearMonth;
		this.dayOfWeek = dayOfWeek;
		this.weekInMonth = weekInMonth;
	}


	private LocalDate generateDate(YearMonth yearMonth, DayOfWeek dayOfWeek, Integer weekInMonth) {
		Integer dayInMonth = DateUtils.getDayOfMonth(dayOfWeek, weekInMonth, yearMonth.getYear(), yearMonth.getMonth());	
		LocalDate aDate = LocalDate.of(yearMonth.getYear(),yearMonth.getMonth(), dayInMonth);
		return aDate;
	}


	public Integer getStep() {
		return step;
	}


	public void setStep(Integer step) {
		this.step = step;
	}


	public YearMonth getYearMonth() {
		return yearMonth;
	}


	public void setYearMonth(YearMonth yearMonth) {
		this.yearMonth = yearMonth;
	}


	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}


	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}


	public Integer getWeekInMonth() {
		return weekInMonth;
	}


	public void setWeekInMonth(Integer weekInMonth) {
		this.weekInMonth = weekInMonth;
	}

}
