public interface IBoardingControl {

    public int call(PassengerList passengerList);

    public boolean inspect(Passport passport);

    public boolean scan(BoardingPass boardingPass);

    public void printPassengerList(PassengerList passengerList);

    public void notifyGroundOperations(BoardingControlReceipt boardingControlReceipt);
    
}
