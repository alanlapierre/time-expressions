package checker;

import java.time.LocalDate;

public class DailyTimeRecurrency extends TimeRecurrency {

	private Integer step;

	public DailyTimeRecurrency(LocalDate dateFrom, Integer step) {
		super(dateFrom);
		this.step = step;
	}

	public Integer getStep() {
		return step;
	}

	public void setStep(Integer step) {
		this.step = step;
	}	
	
}
