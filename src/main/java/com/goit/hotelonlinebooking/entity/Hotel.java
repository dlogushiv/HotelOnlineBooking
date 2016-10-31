package com.goit.hotelonlinebooking.entity;

import java.util.List;

public class Hotel {
    private long hotelId;
    private String hotelName;
    private String cityName;
    private String address;
    private String emailHotel;
    private int rating;
    private List<Room> rooms;


    public Hotel(long hotelId, String hotelName, String cityName, String address, String emailHotel, int rating, List<Room> rooms) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.cityName = cityName;
        this.address = address;
        this.emailHotel = emailHotel;
        this.rating = rating;
        this.rooms = rooms;
    }

    public String getCityName() {
        return cityName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public long getHotelId() {
        return hotelId;
    }

    public String getAddress() {
        return address;
    }

    public int getRating() {
        return rating;
    }

    public String getEmailHotel() {
        return emailHotel;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }


    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Hotel)) return false;
        if (!super.equals(object)) return false;

        Hotel hotel = (Hotel) object;

        if (getHotelId() != hotel.getHotelId()) return false;
        if (getRating() != hotel.getRating()) return false;
        if (getHotelName() != null ? !getHotelName().equals(hotel.getHotelName()) : hotel.getHotelName() != null)
            return false;
        if (getCityName() != null ? !getCityName().equals(hotel.getCityName()) : hotel.getCityName() != null)
            return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) (getHotelId() ^ (getHotelId() >>> 32));
        result = 31 * result + (getHotelName() != null ? getHotelName().hashCode() : 0);
        result = 31 * result + (getCityName() != null ? getCityName().hashCode() : 0);
        result = 31 * result + getRating();
        return result;
    }

    @Override
    public java.lang.String toString() {
        return "Hotel[" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", address='" + address + '\'' +
                ", emailHotel='" + emailHotel + '\'' +
                ", rating=" + rating +
                ']';
    }
}