package checker;

import java.time.LocalDate;

public class TimeRecurrency {

	protected LocalDate dateFrom;

	public TimeRecurrency() {
		super();
	}

	public TimeRecurrency(LocalDate aDate) {
		super();
		this.dateFrom = aDate;
	}

	
	public LocalDate getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(LocalDate dateFrom) {
		this.dateFrom = dateFrom;
	}

}
