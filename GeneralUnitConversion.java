public class GeneralUnitConversion {
    private static final double km2Miles = 0.621371;
    private static final double miles2Km = 1.60934;
    private static final double meters2Feet = 3.28084;
    private static final double feet2Meters = 0.3048;
    private static final double yards2Feet = 3;
    private static final double feet2Yards = 0.333333;
    private static final double meters2Inches = 39.3701;
    private static final double inches2Meters = 0.0254;
    private static final double inches2Centimeter = 2.54;
    private static final double pounds2Kg = 0.453592;
    private static final double kg2Pounds = 2.20462;
    private static final double gallons2Litres = 3.78541;
    private static final double litres2Gallons = 0.264172;
    

    //methods for conversion of units
    public static double convertKmToMiles(double km) {
        return km * km2Miles;
    }
    
    public static double convertMilesToKm(double miles) {
        return miles * miles2Km;
    }
    
    public static double convertMetersToFeet(double meters) {
        return meters * meters2Feet;
    }
    
    public static double convertFeetToMeters(double feet) {
        return feet * feet2Meters;
    }
    
    public static double convertYardsToFeet(double yards) {
        return yards * yards2Feet;
    }
    
    public static double convertFeetToYards(double feet) {
        return feet * feet2Yards;
    }
    
    public static double convertMetersToInches(double meters) {
        return meters * meters2Inches;
    }
    
    public static double convertInchesToMeters(double inches) {
        return inches * inches2Meters;
    }
    
    public static double convertInchesToCentimeters(double inches) {
        return inches * inches2Centimeter;
    }
    
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * pounds2Kg;
    }
    
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * kg2Pounds;
    }
    
    public static double convertGallonsToLiters(double gallons) {
        return gallons * gallons2Litres;
    }
    
    public static double convertLitersToGallons(double liters) {
        return liters * litres2Gallons;
    }
    
    public static void main(String[] args) {
        //printing converted values
        System.out.println("10 km to miles: " + convertKmToMiles(10));
        System.out.println("10 miles to km: " + convertMilesToKm(10));
        System.out.println("10 meters to feet: " + convertMetersToFeet(10));
        System.out.println("10 feet to meters: " + convertFeetToMeters(10));
        System.out.println("10 yards to feet: " + convertYardsToFeet(10));
        System.out.println("10 feet to yards: " + convertFeetToYards(10));
        System.out.println("10 meters to inches: " + convertMetersToInches(10));
        System.out.println("10 inches to meters: " + convertInchesToMeters(10));
        System.out.println("10 inches to centimeters: " + convertInchesToCentimeters(10));
        System.out.println("100 Fahrenheit to Celsius: " + convertFahrenheitToCelsius(100));
        System.out.println("37 Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(37));
        System.out.println("10 pounds to kilograms: " + convertPoundsToKilograms(10));
        System.out.println("10 kilograms to pounds: " + convertKilogramsToPounds(10));
        System.out.println("10 gallons to liters: " + convertGallonsToLiters(10));
        System.out.println("10 liters to gallons: " + convertLitersToGallons(10));
    }
}
