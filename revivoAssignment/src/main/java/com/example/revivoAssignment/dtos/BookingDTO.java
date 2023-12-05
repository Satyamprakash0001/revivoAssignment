package com.example.revivoAssignment.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookingDTO {

    @JsonProperty(value = "UserDetails")
    private UserDetailsDto userDetails;

    @JsonProperty(value = "BookingsDetails")
    private BookingDetailsDto bookingsDetails;

    @JsonProperty(value = "RoomDetails")
    private List<RoomDetailsDto> roomDetails;

    public BookingDTO(UserDetailsDto userDetails, BookingDetailsDto bookingsDetails, List<RoomDetailsDto> roomDetails) {
        this.userDetails = userDetails;
        this.bookingsDetails = bookingsDetails;
        this.roomDetails = roomDetails;
    }

    public UserDetailsDto getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetailsDto userDetails) {
        this.userDetails = userDetails;
    }

    public BookingDetailsDto getBookingsDetails() {
        return bookingsDetails;
    }

    public void setBookingsDetails(BookingDetailsDto bookingsDetails) {
        this.bookingsDetails = bookingsDetails;
    }

    public List<RoomDetailsDto> getRoomDetails() {
        return roomDetails;
    }

    public void setRoomDetails(List<RoomDetailsDto> roomDetails) {
        this.roomDetails = roomDetails;
    }

    
    
    
}
