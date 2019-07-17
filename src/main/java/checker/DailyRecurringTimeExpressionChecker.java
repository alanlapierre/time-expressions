package checker;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DailyRecurringTimeExpressionChecker implements TimeExpressionChecker {

	
	private DailyTimeRecurrency dailyTimeRecurrency;
	
	public DailyRecurringTimeExpressionChecker(DailyTimeRecurrency dailyTimeRecurrency) {
		super();
		this.dailyTimeRecurrency = dailyTimeRecurrency;
	}
	
	
	@Override
	public boolean isRecurringOn(LocalDate aDate) {
		Long daysBetween = ChronoUnit.DAYS.between(dailyTimeRecurrency.getDateFrom().atStartOfDay(), aDate.atStartOfDay());
		return daysBetween % dailyTimeRecurrency.getStep() == 0;
	}

}
