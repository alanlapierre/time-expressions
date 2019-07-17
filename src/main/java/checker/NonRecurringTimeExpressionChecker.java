package checker;
import java.time.LocalDate;

public class NonRecurringTimeExpressionChecker implements TimeExpressionChecker {

	private TimeRecurrency timeRecurrency;
	
	public NonRecurringTimeExpressionChecker(TimeRecurrency timeRecurrency) {
		super();
		this.timeRecurrency = timeRecurrency;
	}

	@Override
	public boolean isRecurringOn(LocalDate aDate) {
		return timeRecurrency.getDateFrom().equals(aDate);
	}

}
