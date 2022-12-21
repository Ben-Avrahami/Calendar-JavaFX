import java.util.Calendar;
import java.util.HashMap;
/**
 * This Class holds a HashMap with a Calendar object as key and String as value
 * @author BenA
 *
 */
public class CalendarData {
	HashMap<Calendar, String> calendarData = new HashMap<>();//The HashMap that hold the data
	/*
	 * This Method adds the data value with the Calendar date as key
	 */
	public void setData(Calendar date, String data){
		calendarData.put(date, data);
	}
	/*
	 * This method returns the String in the given Calendar date
	 */
	public String getData(Calendar date) {
		return calendarData.get(date);	
	}

}
