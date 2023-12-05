package com.example.revivoAssignment.dtos;

import java.util.List;

public class MainDto {
    
    private List<BookingDTO> data;
    private String b_status;
    
    public MainDto(List<BookingDTO> data, String b_status) {
        this.data = data;
        this.b_status = b_status;
    }

    public List<BookingDTO> getData() {
        return data;
    }

    public void setData(List<BookingDTO> data) {
        this.data = data;
    }

    public String getB_status() {
        return b_status;
    }

    public void setB_status(String b_status) {
        this.b_status = b_status;
    }

    
}
