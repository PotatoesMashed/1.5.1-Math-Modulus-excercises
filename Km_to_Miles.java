
class Km_to_Miles extends ConsoleProgram {

  /**
  * Converts kilometers to miles
  * @George D.
  */
  
  public void run() {
    // Declare variables
    double dblKm;
    double dblMi;
    
    // Get KM
    dblKm = readDouble("Enter the distance in KM: ");

    // Computing area
    dblMi = dblKm * 0.621371;

    // Output result
    System.out.println(dblKm + " km = " + dblMi + " miles.");
    
  }
}
