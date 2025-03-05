class GenerateOtp{
    public static String generateOtp(){
        String numbers = "1234567890";
        String otp = "";

        for(int i=0 ; i<6 ; i++){
            otp += numbers.charAt((int)(Math.random()*10)); //pick any charcter from numbers and add it to otp
        }

        return otp;
    }
    public static void main(String[] args) {
        for(int i=0 ; i<10 ; i++){
            System.out.println("Otp " + (i+1) + " : " + generateOtp());
        }
    }
}