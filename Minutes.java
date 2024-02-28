class Minutes extends ConsoleProgram {

  /**
  * Converts minutes to days and hours
  * @George D.
  */
  
  public void run() {
    // Declare Variables
    int intMinutes;
    int intDays;
    int intHours;
    int intLeftOverMinutes;

    // Get minutes
    intMinutes = readInt("Enter number of minutes: ");

    // Computing area
    intDays = intMinutes/(1440);
    intLeftOverMinutes = intMinutes % 1440;

    intHours  = intLeftOverMinutes/60;
    intLeftOverMinutes = intLeftOverMinutes % 60;
   
    // Output results
    System.out.println (intDays + " day(s) " + intHours + " hour(s) " + intLeftOverMinutes + " minute(s).");

    
  }
}