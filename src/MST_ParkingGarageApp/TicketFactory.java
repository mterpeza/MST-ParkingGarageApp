package MST_ParkingGarageApp;

public class TicketFactory {

    //display ticket and each ticket ID

    public garage getgarage(garageOptions garageOptionType){
        switch(garageOptionType){
            case LostTicket: return new LostTicket();
            case minMax: return new minMax();
            case Event: return new Event();
            default: return null;
        }
    }
}

