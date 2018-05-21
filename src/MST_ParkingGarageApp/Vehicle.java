package MST_ParkingGarageApp;

import java.util.Random;

public class Vehicle {

    Random outputRandomNumber = new Random();

    public int getRandomNumber(){
        int randomNumber = outputRandomNumber.nextInt(100) - 1;

        return randomNumber;
    }
}

