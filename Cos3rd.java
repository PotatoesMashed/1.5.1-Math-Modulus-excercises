class Cos3rd extends ConsoleProgram {

  /**
  * Solves for side c with angle C, side a and side b
  * @George D.
  */
  
  public void run() {
    
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblSideC;
    
    // Get side and angle
    dblSideA = readDouble("Enter the length of Side A: ");
    dblSideB = readDouble("Enter the length of Side B: ");
    dblAngleC = readDouble("Enter the angle of contained angle: ");
  
    // Computing
    dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - 2 * dblSideA * dblSideB * Math.cos(Math.toRadians(dblAngleC)));
 
    // Output results
    System.out.println("The length of side C is " + dblSideC);
    
  }
}