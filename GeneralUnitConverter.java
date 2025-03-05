public class GeneralUnitConverter {
    //took conversion values from file and made them constants
    private static final double km2Miles = 0.621371;
    private static final double miles2Km = 1.60934;
    private static final double meters2Feet = 3.28084;
    private static final double feet2Meters = 0.3048;
    private static final double yards2Feet = 3;
    private static final double feet2Yards = 0.333333;
    private static final double meters2Inches = 39.3701;
    private static final double inches2Meters = 0.0254;
    private static final double inches2Centimeter = 2.54;
    
    //conversion methods
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
    }
}
