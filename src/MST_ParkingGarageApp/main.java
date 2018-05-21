package MST_ParkingGarageApp;

import java.util.*;

public class main {

    private static ArrayList<garage> garages = new ArrayList<>();
    private static TicketFactory ticketFactory = new TicketFactory();
    private static garageMenuSingleton menuSingleton;
    private static Scanner reader = new Scanner(System.in);
    private static int  firstMenu,
                        secondMenu;

    // Main Method running each piece of the application.
    public static void main(String[] args) {
        menuSingleton = garageMenuSingleton.getParkingMenusSingleton();

        // Starts the loop to display menus.
        while(firstMenu != 3) {

            // Displays first MenuSingleton.
            menuSingleton.mainMenu();
            firstMenu = reader.nextInt();

            if (firstMenu == 1 || firstMenu == 2) {
                menuSingleton.checkOutMenu();

                // reader for the second menuSingleton.
                secondMenu = reader.nextInt();

                // Displays first menuSingleton and enables users selection.
                if (secondMenu == 1) {
                    if (firstMenu == 1) {
                        garages.add(ticketFactory.getgarage(garageOptions.minMax));
                        for (garage g : garages) {
                            g.displayGarage();
                        }
                    } else {
                        garages.add(ticketFactory.getgarage(garageOptions.Event));
                        for (garage g : garages) {
                            g.displayGarage();
                        }
                    }
                }
                // Displays second menuSingleton and enables users selection.
                else if (secondMenu == 2) {
                    garages.add(ticketFactory.getgarage(garageOptions.LostTicket));
                    for (garage g : garages) {
                        g.displayGarage();
                    }
                }
            }
            // Close Garage.
            else if (firstMenu == 3) {
                menuSingleton.transactionMenu(garages);


            }
        }
    }
}