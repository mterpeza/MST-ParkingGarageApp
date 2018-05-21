package MST_ParkingGarageApp;

import java.text.DecimalFormat;

public class minMax implements garage {
    private double cost;
    private double total;
    private garageMenuSingleton menuSingleton;
    private closeGarage closed = new closeGarage();

    // Time Counter minutes
    public long ticker(){
        long start = System.nanoTime();
        long result = System.nanoTime() - start ;
        long total = 2000 / result;
        return total;
    }

    public minMax() {

        cost = 0.004;
        total = ticker() * cost;

        if(total < 3.00){
            total = 3.00;
        }
    }

    @Override
    public void displayGarage() {
        // restricts decimal to 2 after the point.
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        menuSingleton = garageMenuSingleton.getParkingMenusSingleton();
        System.out.println("Total time parked " + ticker() + " seconds.\n" +
                            "Your total cost is $" + numberFormat.format(total)
                             + " for vehicle number ");
        System.out.println(" ");
        System.out.println("-----------------");
        System.out.println("MST Parking Garage");
        System.out.println("============================");
        System.out.println("Receipt for ID #: " + menuSingleton.vehicleID());
        System.out.println("Your total is " + numberFormat.format(total) +  " for vehicle ID " + menuSingleton.vehicleID());

        closed.getcloseGarage(total, menuSingleton.vehicleID());
    }
}
