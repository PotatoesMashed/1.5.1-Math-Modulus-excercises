class Rads extends ConsoleProgram {

  /**
  * Converts degrees to radians
  * @George D.
  */
  
  public void run() {
    //Declare variables
    double dblDegrees;
    double dblRadians;
    
    // Get degrees 
    dblDegrees = readDouble("Enter the angle in degrees: ");

    // Convert to radians
    dblRadians  = Math.toRadians(dblDegrees);
    
    // Output results
    System.out.println(dblDegrees + " degrees = " + dblRadians + " radians");
    
  }
}