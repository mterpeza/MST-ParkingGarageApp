package MST_ParkingGarageApp;

import java.util.*;

public class garageMenuSingleton {

    // This displays the menu and vehicle ID

    private garageMenuSingleton(){

    }

    private static garageMenuSingleton parkingMenusSingleton = new garageMenuSingleton();
    public static garageMenuSingleton getParkingMenusSingleton () {return parkingMenusSingleton;}

    private String ParkingGarage = "MST Parking Garage";
    private static minMax min = new minMax();
    private static Vehicle vehicleID = new Vehicle();
    private static int IDnumber = 0;

    // List Primary menu
    public void mainMenu() {

        System.out.println(ParkingGarage);
        System.out.println("=================================");
        System.out.println("1 – Check/In\n" +
                            "\n" +
                            "2 – Special Event\n" +
                            "\n" +
                            "3 – Close Garage\n" +
                            "\n" +
                            "-------------------------");
        }

        //Second menu displayed after check in or special event
        public void checkOutMenu() {

        System.out.println(ParkingGarage);
        System.out.println("=================================");
        System.out.println("1 – Check/Out\n" +
                            "\n" +
                            "2 – Lost Ticket\n" +
                            "\n" +
                            "Vehicle ID " + vehicleID());
        }

        // Transaction history data
        public void transactionMenu(ArrayList<garage> garages) {

            System.out.println(ParkingGarage);
            System.out.println("=================================");
            System.out.println("Garage Transaction History \n" +
                    "  \n");

            for (garage t : garages) {
                t.displayGarage();
            }
        }

        // vehicle ID
        public int vehicleID(){
            Random rand = new Random();

            int number = rand.nextInt(50) + 1;

            return number;
        }
}

