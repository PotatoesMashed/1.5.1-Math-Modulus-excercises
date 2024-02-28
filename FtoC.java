class FtoC extends ConsoleProgram {

  /**
  * Converts Fahrenheit to Celsius
  * @George D.
  */
  
  public void run() {
    double dblCelsius;
    double dblFahrenheit;
    
    // Get Fahrenheit
    dblFahrenheit = readDouble("Enter the temperature in degrees Fahrenheit: ");

    // Computing Area
    dblCelsius = 5.0/9.0 * (dblFahrenheit - 32);

    // Output Result
    System.out.println(dblFahrenheit + " degrees Fahrenheit = " + dblCelsius + " degrees Celsius.");

    
  }
}