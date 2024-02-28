class AreaSin extends ConsoleProgram {

  /**
  * Finds area of a triangle from 2 sides and an angle
  * @George D.
  */
  
  public void run() {

    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblArea;

    // Side and angle information
    dblSideA = readDouble("Enter length of side A: ");
    dblSideB = readDouble("Enter length of side B: ");
    dblAngleC = readDouble("Enter degree of angle angle contained by Side A and B(degrees): ");

    // Computing area
    dblArea = (dblSideA * dblSideB * Math.sin(Math.toRadians(dblAngleC))) / 2.0;

    // Output result
    System.out.println("The area is " + dblArea);
  }
}