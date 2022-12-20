import java.util.Calendar;
import java.util.HashMap;

public class CalendarData {
	HashMap<Calendar, String> calendarData = new HashMap<>();

	public void setData(Calendar date, String data){
		calendarData.put(date, data);
	}

	public String getData(Calendar date) {
		return calendarData.get(date);	
	}

}
