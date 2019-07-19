package com.alanlapierre.timexp.main;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.YearMonth;

import com.alanlapierre.timexp.checker.ComplexMonthlyRecurringTimeExpressionChecker;
import com.alanlapierre.timexp.checker.DailyRecurringTimeExpressionChecker;
import com.alanlapierre.timexp.checker.DailyTimeRecurrency;
import com.alanlapierre.timexp.checker.MonthlyTimeRecurrency;
import com.alanlapierre.timexp.checker.NonRecurringTimeExpressionChecker;
import com.alanlapierre.timexp.checker.SimpleMonthlyRecurringTimeExpressionChecker;
import com.alanlapierre.timexp.checker.TimeExpressionChecker;
import com.alanlapierre.timexp.checker.TimeRecurrency;
import com.alanlapierre.timexp.checker.YearlyRecurringTimeExpressionChecker;
import com.alanlapierre.timexp.checker.YearlyTimeRecurrency;

public class TimeExpression {

	private TimeExpressionChecker timeExpressionChecker;
	
	public static TimeExpression on(LocalDate aDate) {
		TimeExpression result = new TimeExpression();
		TimeExpressionChecker timeExpressionChecker = new NonRecurringTimeExpressionChecker(new TimeRecurrency(aDate));
		result.setTimeExpressionChecker(timeExpressionChecker);
		return result;
	}

	public static TimeExpression dailyEveryFromOnwards(int anAmountOfDays, LocalDate aDate) {
		TimeExpression result = new TimeExpression();
		TimeExpressionChecker timeExpressionChecker = new DailyRecurringTimeExpressionChecker(new DailyTimeRecurrency(aDate, anAmountOfDays));
		result.setTimeExpressionChecker(timeExpressionChecker);
		return result;
	}

	public static TimeExpression monthlyEveryOnFromOnwards(int anAmountOfMonths, int aDayInMonth, YearMonth anYear) {
		TimeExpression result = new TimeExpression();
		LocalDate aDate = LocalDate.of(anYear.getYear(),anYear.getMonth(), aDayInMonth);
		TimeExpressionChecker timeExpressionChecker = new SimpleMonthlyRecurringTimeExpressionChecker(new MonthlyTimeRecurrency(aDate, anAmountOfMonths));
		result.setTimeExpressionChecker(timeExpressionChecker);	
		return result;
	}

	public static TimeExpression monthlyEveryOnOfFromOnwards(int anAmountOfMonths, DayOfWeek aDayOfWeek,
			int aWeekInMonth, YearMonth anYear) {
		TimeExpression result = new TimeExpression();
		TimeExpressionChecker timeExpressionChecker = new ComplexMonthlyRecurringTimeExpressionChecker(new MonthlyTimeRecurrency(anAmountOfMonths, anYear, aDayOfWeek, aWeekInMonth));
		result.setTimeExpressionChecker(timeExpressionChecker);	
		return result;
	}

	public static TimeExpression yearlyEveryOnFromOnwards(int anAmountOfYears, MonthDay aMonthDay, int anYear) {  
 		TimeExpression result = new TimeExpression();
 		TimeExpressionChecker timeExpressionChecker = new YearlyRecurringTimeExpressionChecker(new YearlyTimeRecurrency(anAmountOfYears, anYear, aMonthDay));
 		result.setTimeExpressionChecker(timeExpressionChecker);	
		return result;
	}

	public boolean isRecurringOn(LocalDate aDate) {
		return timeExpressionChecker.isRecurringOn(aDate);
	}

	private void setTimeExpressionChecker(TimeExpressionChecker timeExpressionChecker) {
		this.timeExpressionChecker = timeExpressionChecker;
	}



}
