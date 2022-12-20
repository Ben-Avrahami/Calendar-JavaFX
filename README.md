<h1>Calendar</h1>

<p>This is a JavaFX application that displays a calendar for a given month and year. The user can select a month and year from dropdown menus, and can view and edit the data for a specific date by clicking on a day in the calendar. The data for each date is stored in a <code>CalendarData</code> object using a <code>HashMap</code> with <code>Calendar</code> objects as keys and <code>String</code> data as values.</p>

<h2>Requirements</h2>

<ul>
  <li>Java 11 or higher</li>
  <li>JavaFX 11 or higher</li>
</ul>

<h2>Running the Application</h2>

<p>To run the application, use the following command:</p>

<pre><code>$ java --module-path PATH_TO_FX --add-modules=javafx.controls,javafx.fxml -cp PATH_TO_CLASS_FILES Calendar
</code></pre>

<p>Replace <code>PATH_TO_FX</code> with the path to your JavaFX library, and <code>PATH_TO_CLASS_FILES</code> with the path to the directory containing the compiled class files.</p>

<h2>File Overview</h2>

<ul>
  <li><code>CalendarData.java</code>: Class that stores the data for each date in a <code>HashMap</code>.</li>
  <li><code>Calendar.java</code>: Main class that launches the JavaFX application and displays the calendar. </li>
  <li><code>CalendarController.java</code>: Controller class for the calendar application, containing event handlers for user interactions.</li>
</ul>

<h2>CalendarData</h2>

<p>The <code>CalendarData</code> class has two methods:</p>

<ul>
  <li><code>setData(Calendar date, String data)</code>: Stores the provided <code>data</code> in the <code>calendarData</code> <code>HashMap</code> under the key of the provided <code>date</code> <code>Calendar</code> object.</li>
  <li><code>getData(Calendar date)</code>: Returns the data stored in the <code>calendarData</code> <code>HashMap</code> under the key of the provided <code>date</code> <code>Calendar</code> object.</li>
</ul>

<h2>Calendar</h2>

<p>The <code>Calendar</code> class extends the <code>Application</code> class and overrides the <code>start</code> method to display the calendar. It also contains the <code>main</code> method to launch the application.</p>

<h2>CalendarController</h2>

<p>The <code>CalendarController</code> class contains the event handlers and logic for the calendar application. It has the following methods:</p>

<ul>
  <li><code>monthPressed(ActionEvent event)</
