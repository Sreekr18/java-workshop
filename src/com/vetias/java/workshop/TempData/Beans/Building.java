package vetias.java.workshop.TempData.Beans;

import java.time.LocalDateTime;

public class Building {
    private String name;
    private String area;
    private int floors;
    private LocalDateTime openDateTime;
    private LocalDateTime closeDateTime;
    public String getName() {
        return name;
    }
    public void setName(String aName) {
        name = aName;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String aArea) {
        area = aArea;
    }
    public int getFloors() {
        return floors;
    }
    public void setFloors(int aFloors) {
        floors = aFloors;
    }
    public LocalDateTime getOpenDateTime() {
        return openDateTime;
    }
    public void setOpenDateTime(LocalDateTime aOpenDateTime) {
        openDateTime = aOpenDateTime;
    }
    public LocalDateTime getCloseDateTime() {
        return closeDateTime;
    }
    public void setCloseDateTime(LocalDateTime aCloseDateTime) {
        closeDateTime = aCloseDateTime;
    }


}
