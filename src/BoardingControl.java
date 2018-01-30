public class BoardingControl {
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

    public boolean inspectPassport(Passport passport) {
        return true;

    }

    public boolean scanBoardingPass(BoardingPass boardingPass) {
        return true;
    }

    public void printPassengerList(PassengerList passengerList) {

    }

    public void notifyGroundOperations(BoardingControlReceipt boardingControlReceipt) {

    }

    public class Port implements IBoardingControl {

        public int call(PassengerList passengerList) {
            return call(passengerList);
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
    }
}
