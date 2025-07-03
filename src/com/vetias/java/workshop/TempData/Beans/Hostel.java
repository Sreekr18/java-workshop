package vetias.java.workshop.TempData.Beans;

public class Hostel extends Building {

    private String hostelName;
    private int numberOfFloors;

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String aHostelName) {
        this.hostelName = aHostelName;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int aNumberOfFloors) {
        this.numberOfFloors = aNumberOfFloors;
    }

}
