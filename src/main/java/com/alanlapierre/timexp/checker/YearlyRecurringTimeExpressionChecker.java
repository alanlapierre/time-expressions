package com.alanlapierre.timexp.checker;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class YearlyRecurringTimeExpressionChecker implements TimeExpressionChecker {

	private YearlyTimeRecurrency yearlyTimeRecurrency;
	
	public YearlyRecurringTimeExpressionChecker(YearlyTimeRecurrency yearlyTimeRecurrency) {
		super();
		this.yearlyTimeRecurrency = yearlyTimeRecurrency;
	}
	
	@Override
	public boolean isRecurringOn(LocalDate aDate) {
		
		Long yearsBetween = ChronoUnit.YEARS.between(yearlyTimeRecurrency.getDateFrom(), aDate);
		
		if(yearsBetween % yearlyTimeRecurrency.getStep() != 0){
			return false;
		}

		if(yearlyTimeRecurrency.getDateFrom().getMonth() != aDate.getMonth()) {
			return false;
		}
		
		if(yearlyTimeRecurrency.getDateFrom().getDayOfMonth() != aDate.getDayOfMonth()){
			return false;
		}
		
		return true;

	}

}
