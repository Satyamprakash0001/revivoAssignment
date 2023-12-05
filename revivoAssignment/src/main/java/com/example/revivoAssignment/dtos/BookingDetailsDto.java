package com.example.revivoAssignment.dtos;

public class BookingDetailsDto {
    
    private int hotel_id;
    private String hotel_name;
    
    public BookingDetailsDto(int hotel_id, String hotel_name) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    
}
