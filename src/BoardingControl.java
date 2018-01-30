public class BoardingControl implements IBoardingControl {
    private static BoardingControl instance = new BoardingControl();
    public Port port;

    private CheckInDesk checkInDesk;
    private PassengerList boardedPassengerList;

    private BoardingControl() {
        port = new Port();
    }

    public static BoardingControl getInstance() {
        return instance;
    }

    public int call(PassengerList passengerList) {
        return 0;
    }

    public boolean inspect(Passport passport) {
        return false;
    }

    public boolean scan(BoardingPass boardingPass) {
        return false;
    }

    public void printPassengerList(PassengerList passengerList) {

    }

    public void notifyGroundOperations(BoardingControlReceipt boardingControlReceipt) {

    }

    public class Port {

    }
}
