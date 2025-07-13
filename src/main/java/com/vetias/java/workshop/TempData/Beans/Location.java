package com.vetias.java.workshop.tempdata.beans;
import java.io.Serializable;

public class Location implements Serializable {
    private String name;
    private double latitude;
    private double longitude;
    private String description;
    private String country;
    private String city;
    private String address;
    private String postalCode;

    public void setName(String aName){
        name=aName;
    }

    public String getName(){
        return name;
    }   
    public void setLatitude(Double aLatitude){
        latitude=aLatitude;
    }
    public Double getLatitude(){
        return latitude;
    }
    public void setLongitude(Double aLongitude){
        longitude=aLongitude;
    }
    public Double getLongitude(){
        return longitude;
    }
    public void setDescription(String aDescription){
        description=aDescription;
    }
    public String getDescription(){
        return description;
    }
    public void setCountry(String aCountry){
        country=aCountry;
    }
    public String getCountry(){
        return country;
    }
    public void setCity(String aCity){
        city=aCity;
    }
    public String getCity(){
        return city;
    }
    public void setAddress(String aAddress){
        address=aAddress;
    }
    public String getAddress(){
        return address;
    }
    public void setPostalCode(String aPostalCode){
        postalCode=aPostalCode;
    }
    public String getPostalCode(){
        return postalCode;
    }

    @Override
    public String toString() {
        return "Location{name"+ name+
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", description=" +description +
                ",country=" + country +
                ", city=" + city +
                ", address=" + address +
                ", postalCode=" + postalCode +
                "}";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;

        Location location = (Location) o;

        if (Double.compare(location.latitude, latitude) != 0) return false;
        if (Double.compare(location.longitude, longitude) != 0) return false;
        if (name != null ? !name.equals(location.name) : location.name != null) return false;
        if (description != null ? !description.equals(location.description) : location.description != null)
            return false;
        if (country != null ? !country.equals(location.country) : location.country != null) return false;
        if (city != null ? !city.equals(location.city) : location.city != null) return false;
        if (address != null ? !address.equals(location.address) : location.address != null) return false;
        return postalCode != null ? postalCode.equals(location.postalCode) : location.postalCode == null;
    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(latitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        return result;
    }
}
