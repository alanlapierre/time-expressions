package checker;
import java.time.LocalDate;

public interface TimeExpressionChecker {
	
	public boolean isRecurringOn(LocalDate aDate);
}
