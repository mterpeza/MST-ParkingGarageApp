package MST_ParkingGarageApp;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class closeGarage {

    // Gathers all garage transactions while garage is open

    public ArrayList<String> getcloseGarage(double total, int carID ){

        DecimalFormat numberFormat = new DecimalFormat("#.00");

        ArrayList<String> transactions = new ArrayList<>();
        transactions.add("Total Amount: " +
                            String.valueOf(numberFormat.format(total)) +
                            " Vehicle ID number: " +
                            carID);

        return transactions;
    }
}
