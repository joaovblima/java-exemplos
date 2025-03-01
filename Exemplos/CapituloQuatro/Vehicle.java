public class Vehicle {
    int passangers;
    int fuelcap;
    int mpg;

    Vehicle(int p, int f, int m){
        passangers = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
       return fuelcap * mpg;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class VehicleDemo{
    public static void main(String[] args) {
        int range1, range2;
        double gallons;
        int dist = 252;

        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle strada = new Vehicle(4, 14, 12);

        range2 = strada.range();

        gallons = minivan.fuelneeded(dist);

        System.out.println("Para percorrer " + dist + " milhas a Minivan precisa de "+
                gallons + " galões de combustível.");
        gallons = strada.fuelneeded(dist);
        System.out.println("Para percorrer " + dist + " milhas a Strada precisa de "+
                gallons + "galões de combustível.");
    }
}
