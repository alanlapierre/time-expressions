package com.alanlapierre.timexp.checker;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.alanlapierre.timexp.utils.DateUtils;

public class ComplexMonthlyRecurringTimeExpressionChecker implements TimeExpressionChecker {

	private MonthlyTimeRecurrency monthlyTimeRecurrency;
	
	public ComplexMonthlyRecurringTimeExpressionChecker(MonthlyTimeRecurrency monthlyTimeRecurrency) {
		super();
		this.monthlyTimeRecurrency = monthlyTimeRecurrency;
	}
	
	@Override
	public boolean isRecurringOn(LocalDate aDate) {

		Long monthsBetween = ChronoUnit.MONTHS.between(monthlyTimeRecurrency.getDateFrom(), aDate);

		if (monthsBetween % monthlyTimeRecurrency.getStep() != 0) {
			return false;
		}

		int correctDayOfMonth = DateUtils.getDayOfMonth(monthlyTimeRecurrency.getDayOfWeek(), monthlyTimeRecurrency.getWeekInMonth(), aDate.getYear(),
				aDate.getMonth());

		if (aDate.getDayOfMonth() != correctDayOfMonth) {
			return false;
		}

		return true;
	}

}
