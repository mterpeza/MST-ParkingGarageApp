package MST_ParkingGarageApp;

import java.text.DecimalFormat;

public class LostTicket implements garage {

    private closeGarage closed;

    garageMenuSingleton menuSingleton;
    int time;
    double cost;

    public LostTicket() {
        time = 0;
        cost = 25.00;
    }

    @Override
    public void displayGarage() {

        // restricts decimal to 2 after the point.
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        menuSingleton = garageMenuSingleton.getParkingMenusSingleton();
        System.out.println("Lost ticket fee $ " + cost);
        System.out.println(" ");
        System.out.println("-----------------");
        System.out.println("MST Parking Garage");
        System.out.println("============================");
        System.out.println("Receipt for ID #: " + menuSingleton.vehicleID());
        System.out.println("Your total is " + numberFormat.format(cost) +  " for vehicle ID " +
                menuSingleton.vehicleID());

        closed.getcloseGarage(cost, menuSingleton.vehicleID());
    }

}