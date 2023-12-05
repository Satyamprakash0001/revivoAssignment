package com.example.revivoAssignment.dtos;

public class RoomDetailsDto {
    
    private int room_type_id;
    private int no_of_rooms;
    
    public RoomDetailsDto(int room_type_id, int no_of_rooms) {
        this.room_type_id = room_type_id;
        this.no_of_rooms = no_of_rooms;
    }

    public int getRoom_type_id() {
        return room_type_id;
    }

    public void setRoom_type_id(int room_type_id) {
        this.room_type_id = room_type_id;
    }

    public int getNo_of_rooms() {
        return no_of_rooms;
    }

    public void setNo_of_rooms(int no_of_rooms) {
        this.no_of_rooms = no_of_rooms;
    }

    
}
