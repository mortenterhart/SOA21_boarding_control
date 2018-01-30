public class BoardingControl {
    private static BoardingControl instance = new BoardingControl();
    public Port port;


    private CheckInDesk checkInDesk;
    private PassengerList boardedPassengerList;

    private BoardingControl() {
        PortFactory factory = new PortFactory();
        port = factory.produceInstance();
    }

    public static BoardingControl getInstance() {
        return instance;
    }

    public int callPassengers(PassengerList passengerList) {
        return 0;
    }

    public boolean inspectPassport(Passport passport) {
        return true;

    }

    public boolean scanBoardingPass(BoardingPass boardingPass) {
        return true;
    }

    public void printPassengerList(PassengerList passengerList) {
        for(int index = 0; index <= passengerList.size(); index++){
            System.out.println(passengerList.get(index));
        }
    }

    public void notifyGroundOperations(BoardingControlReceipt boardingControlReceipt) {
        System.out.println("GroundOperations! There is something");
    }

    public class Port implements IBoardingControl {

        public int call(PassengerList passengerList) {
            return callPassengers(passengerList);
        }

        public boolean inspect(Passport passport) {
            return inspectPassport(passport);
        }

        public boolean scan(BoardingPass boardingPass) {
            return scanBoardingPass(boardingPass);
        }

        public void printPassengerList(PassengerList passengerList) {

        }

        public void notifyGroundOperations(BoardingControlReceipt boardingControlReceipt) {

        }
    }

    private class PortFactory implements IFactory {

        public Port produceInstance() {
            return new Port();
        }
    }
}
