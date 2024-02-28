class Power extends ConsoleProgram {

  /**
  * Calculates the exponent
  * @George D.
  */
  
  public void run() {
    // Declare variables
    double dblBase;
    double dblExponent;
    double dblPow;

    // Get base and exponent
    dblBase = readDouble("Enter the base: ");
    dblExponent = readDouble("Enter exponent: ");

    // Computing area
    dblPow = Math.pow(dblBase, dblExponent);

    // Output result
    System.out.println(dblBase + " to the power of " + dblExponent + " is " + dblPow);

    
  }
}