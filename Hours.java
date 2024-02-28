class Hours extends ConsoleProgram {

  /**
  * Converts hours to days
  * @George D.
  */
  
  public void run() {
    // Declares variables
    int intHours;
    int intDays;
    int intLeftOverHours;

    // Get hours
    intHours = readInt("Enter the number of hours: ");

    // Computing area
    intDays = intHours/24;
    intLeftOverHours = intHours % 24;

    // Output results
    System.out.println(intHours + " = " + intDays + " days and " + intLeftOverHours + " hours");

    
  }
}