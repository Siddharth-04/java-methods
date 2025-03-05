public class UnitConverter {
    private static final double km2Miles = 0.621371;
    private static final double miles2Km = 1.60934;
    private static final double meters2Feet = 3.28084;
    private static final double ft2Meters = 0.3048;
    
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
        return feet * ft2Meters;
    }
    
    public static void main(String[] args) {
        System.out.println("10 km to miles: " + convertKmToMiles(10)); //calling function and printing the result
        System.out.println("10 miles to km: " + convertMilesToKm(10));
        System.out.println("10 meters to feet: " + convertMetersToFeet(10));
        System.out.println("10 feet to meters: " + convertFeetToMeters(10));
    }
}
