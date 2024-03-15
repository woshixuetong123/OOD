public class ParkingDisplayBoard {
    private String id;
    private HandicappedSpt handicappedFreeSpot;
    private CompactSpot compactFreeSpot;
    private LargeSpot largeFreeSpot;
    private MotorbikeSopt motobikeFreeSpot;
    private ElectricSpot electricFreeSpot;

    public void showemptySpotNumber() {
        String message = "";
        if(handicappedFreeSpot.isFree()) {
            message += "Free Handicapped: " + handicappedFreeSpot.getNumber();
        } else {
            message += "Handcapped is full";
        }
        message += System.lineSeparator();

        iif(compactFreeSpot.IsFree()){
            message += "Free Compact: " + compactFreeSpot.getNumber();
        } else {
            message += "Compact is full";
        }
        message += System.lineSeparator();

        if(largeFreeSpot.IsFree()){
            message += "Free Large: " + largeFreeSpot.getNumber();
        } else {
            message += "Large is full";
        }
        message += System.lineSeparator();

        if(motorbikeFreeSpot.IsFree()){
            message += "Free Motorbike: " + motorbikeFreeSpot.getNumber();
        } else {
            message += "Motorbike is full";
        }
        message += System.lineSeparator();

        if(electricFreeSpot.IsFree()){
            message += "Free Electric: " + electricFreeSpot.getNumber();
        } else {
            message += "Electric is full";
        }
        Show(message);
    }
}


}