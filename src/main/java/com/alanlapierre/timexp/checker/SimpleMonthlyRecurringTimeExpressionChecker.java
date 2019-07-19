package com.alanlapierre.timexp.checker;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SimpleMonthlyRecurringTimeExpressionChecker implements TimeExpressionChecker {

	private MonthlyTimeRecurrency monthlyTimeRecurrency;
	
	public SimpleMonthlyRecurringTimeExpressionChecker(MonthlyTimeRecurrency monthlyTimeRecurrency) {
		super();
		this.monthlyTimeRecurrency = monthlyTimeRecurrency;
	}
	
	
	@Override
	public boolean isRecurringOn(LocalDate aDate) {
		
		Long monthsBetween = ChronoUnit.MONTHS.between(monthlyTimeRecurrency.getDateFrom(), aDate);
		
		if(monthsBetween % monthlyTimeRecurrency.getStep() != 0){
			return false;
		}
		
		if(aDate.getDayOfMonth() != monthlyTimeRecurrency.getDateFrom().getDayOfMonth()){
			return false;
		}
		
		return true;
	}

}
