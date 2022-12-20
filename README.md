2 / 2

<h1>Calendar</h1>
<p>This is a calendar application built using Java and JavaFX. It allows the user to select a month and year, and displays a calendar for that month. The user can also enter text for a specific date and save it, so that the text can be retrieved when the same month and year are selected.</p>

## Demo

![My Remote Image](https://i.ibb.co/PwDMTmF/Calendar-Java-FX.png)

<h2>Requirements</h2>
<ul>
  <li>Java 11 or higher</li>
  <li>JavaFX 11 or higher</li>
</ul>
<h2>How to use</h2>
<ol>
  <li>Clone or download the repository to your local machine.</li>
  <li>Open the project in your preferred Java IDE.</li>
  <li>Run the <code>Calendar</code> class located in the <code>calendar</code> package.</li>
  <li>Select a month and year from the respective dropdown menus.</li>
  <li>Click on a date to view or enter text for that date.</li>
  <li>Click the "Save" button to save the text for that date.</li>
  <li>To view the text for a previously saved date, select the same month and year and click on that date.</li>
</ol>
<h2>Code structure</h2>
<p>The code is split into three main classes:</p>
<ul>
  <li><code>CalendarData</code>: This class contains a <code>HashMap</code> that stores the text for a given date as the value, with the date as the key. It has two methods:
    <ul>
      <li><code>setData(Calendar date, String data)</code>: This method allows the user to set the text for a specific date. It takes a <code>Calendar</code> object as the first argument and a <code>String</code> object as the second argument.</li>
      <li><code>getData(Calendar date)</code>: This method returns the text for a specific date. It takes a <code>Calendar</code> object as the argument and returns a <code>String</code> object.</li>
    </ul>
  </li>
  <li><code>Calendar</code>: This class extends the <code>Application</code> class from JavaFX and serves as the entry point for the application. It sets up the main window and loads the FXML file for the calendar interface.</li>
  <li><code>CalendarController</code>: This class contains the logic for the calendar interface. It has several methods that handle user input and control the behavior of the calendar. Some of the notable methods are:
    <ul>
      <li><code>monthPressed(ActionEvent event)</code>: This method is called when a month is selected from the month dropdown menu. It sets the selected month in the <code>Calendar</code> object, and calls the <code>numberOfDaysInMonth()</code> method.</li>
      <li><code>yearPressed(ActionEvent event)</code>: This method is called when a year is selected from the year dropdown menu. It sets the selected year in the <code>Calendar</code> object, and calls the <code>numberOfDaysInMonth()</code> method.</li>
      <li><code>savePressed(ActionEvent event)</code>: This method is called when the "Save" button is clicked. It saves the text from the text area to the <code>CalendarData</code> object using the <code>setData</code> method, with the current date as the key.</li>
      <li><code>createDaysBtns(int daysInMonth)</code>: This method generates buttons for the dates in the calendar, based on the number of days in the selected month. It also adds event listeners to the buttons that display the text for the corresponding date when clicked.</li>
    </ul>
  </li>
</ul>



<h2>Known Issues</h2>

<p>There are no known issues at this time.</p>


## 🚀 About Me
● Software developer with knowledge in Java, C, Python.

● Experience developing projects using: Java, C, JavaFX, Git, GitHub etc.

● B.Sc. Computer Science Student at The Open University of Israel.