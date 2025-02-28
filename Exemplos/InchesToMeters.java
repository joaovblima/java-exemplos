public class InchesToMeters {
    public static void main(String[] args) {
        double inches, foots, meters;
        foots = 12;
        inches = 12 * foots;
        meters = inches / 39.37;
        int countInches, countFoots;
        int count = 0;

        System.out.println("Foots: "+foots);
        System.out.println("Inches: "+inches);
        System.out.println("Meters: "+meters);

        for(countInches = 0; countInches<= inches; countInches++) {
            System.out.println(countInches + " inche(s)");
            count++;
            if(count == 12){
                System.out.println();
                count = 0;
            }

        }
    }
}
