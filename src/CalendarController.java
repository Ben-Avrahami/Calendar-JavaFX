import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import java.util.Calendar;

public class CalendarController {

	@FXML
	private GridPane daysGrid;

	@FXML
	private MenuButton monthMenuBtn;

	@FXML
	private Button saveBtn;

	@FXML
	private TextArea textArea;

	@FXML
	private Label chosenDateLabel;

	@FXML
	private MenuButton yearMenuBtn;

	Calendar c = Calendar.getInstance();

	private boolean _monthChosen=false;//used to track if a month was already chosen
	private boolean _yearChosen=false;//used to track if a year was already chosen
	private Button[] btns;//the array that will contain the buttons
	private final int BUTTONS_IN_A_ROW=7;
	private final int LINES=6;
	CalendarData calendarData=new CalendarData();

	/*
	 * This method is called when a month is chosen
	 */
	@FXML
	void monthPressed(ActionEvent event) {
		javafx.scene.control.MenuItem btn= (javafx.scene.control.MenuItem) event.getSource();
		monthMenuBtn.setText(btn.getText());//changes the text of the month menu button the the chosen month
		int month=Integer.parseInt(btn.getText());
		c.set(Calendar.MONTH, month-1);//sets the calendar to the chosen month
		_monthChosen=true;//changes _monthChosen to true
		numberOfDaysInMonth();//calls the numberOfDaysInMonth Function
	}

	/*
	 * This method is called when the save button is pressed
	 */
	@FXML
	void savePressed(ActionEvent event) {
		calendarData.setData(c,textArea.getText());
	}

	/*
	 * This method is called when a year is chosen
	 */
	@FXML
	void yearPressed(ActionEvent event) {
		javafx.scene.control.MenuItem btn= (javafx.scene.control.MenuItem) event.getSource();
		yearMenuBtn.setText(btn.getText());//changes the text of the year menu button the the chosen year
		int year=Integer.parseInt(btn.getText());
		_yearChosen=true;//changes _yearChosen to true
		c.set(Calendar.YEAR, year);//sets the calendar to the chosen Year
		numberOfDaysInMonth();//calls the numberOfDaysInMonth Function
	}

	/*
	 * This method checks how many days are in the chosen month and year and calls createDaysBtns() to create the buttons according to the amount of days in the month and the day the month starts in
	 */
	private void numberOfDaysInMonth() {
		if (_monthChosen && _yearChosen) {//checks if year and month were chosen already
			int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			createDaysBtns(daysInMonth);
		}
	}

	/*
	 * This method creates the buttons according to the amount of days in the month and the day the month starts in
	 */
	private void createDaysBtns(int daysInMonth) {
		c.set(Calendar.DAY_OF_MONTH, 1);
		btns = new Button[daysInMonth+c.get(Calendar.DAY_OF_WEEK)+1];//sets the size of the array to the days in the month + the first day in the week
		daysGrid.getChildren().clear();
		for (int i =c.get(Calendar.DAY_OF_WEEK)-1; i < daysInMonth+ c.get(Calendar.DAY_OF_WEEK)-1; i++) {//creates the buttons from a-z and attaches a function to the buttons
			btns[i] = new Button(i+2-c.get(Calendar.DAY_OF_WEEK) +"");//adds a text to the button
			btns[i].setPrefSize(daysGrid.getPrefWidth()/BUTTONS_IN_A_ROW, daysGrid.getPrefHeight()/LINES);//sets the size to fit the window
			daysGrid.add(btns[i], i%BUTTONS_IN_A_ROW , i/BUTTONS_IN_A_ROW);//adds the button to the grid

			btns[i].setOnAction(new EventHandler<ActionEvent>(){//sets the function for the buttons
				public void handle(ActionEvent event) {
					dayPressed(event);
				}	
			}); 
		}
	}

	/*
	 * This method is called when a day is Pressed
	 */
	private void dayPressed(ActionEvent event){
		Button dayBtn= (Button) event.getSource();
		int day=Integer.parseInt(dayBtn.getText());
		c.set(Calendar.DAY_OF_MONTH, day);//sets the calendar to the chosen day
		textArea.setText(calendarData.getData(c));//sets the text in the text area to the text in the HashMap of the given date, if no String is saved for this date will display an empty TextArea
		int dayInMonth=c.get(Calendar.DAY_OF_MONTH);
		int month=c.get(Calendar.MONTH)+1;
		int year=c.get(Calendar.YEAR);
		chosenDateLabel.setText("Chosen Date: "+ dayInMonth+ "/"+ month + "/"+ year);//Sets the text of the label that shows the chosen date to show the date selected
	}
}
