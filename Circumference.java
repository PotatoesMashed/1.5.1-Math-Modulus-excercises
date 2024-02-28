class Circumference extends ConsoleProgram {

  /**
  * Finds circumference of a circle
  * @George D.
  */
  
  public void run() {
    double dblRadius;
    double dblCircumference;

    // Get radius
    dblRadius = readDouble("Enter the radius of your circle? ");
    
    // Compute circumference
    dblCircumference = 2 * Math.PI * dblRadius;

    // Output results
    System.out.println("The circumference is: " + dblCircumference);
  }
}