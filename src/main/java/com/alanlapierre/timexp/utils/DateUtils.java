package com.alanlapierre.timexp.utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateUtils {
	
	public static Integer getDayOfMonth(DayOfWeek aDayOfWeek, int aWeekInMonth, int year, Month month) {

		if (month.getValue() == 2 && aWeekInMonth > 4) {
			aWeekInMonth = 4;
		}

		DayOfWeek firstDayOfWeek = LocalDate.of(year, month, 1).getDayOfWeek();
		Integer dayInMonth = (aWeekInMonth - 1) * 7 + 1;

		if (firstDayOfWeek.getValue() == 7 && dayInMonth == 1) {
			dayInMonth += aDayOfWeek.getValue();
		} else if (firstDayOfWeek.getValue() != aDayOfWeek.getValue()) {
			dayInMonth += aDayOfWeek.getValue() - firstDayOfWeek.getValue();
		}
		return dayInMonth;
	}

}
