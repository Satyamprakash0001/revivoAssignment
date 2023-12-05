package com.example.revivoAssignment.dtos;

public class UserDetailsDto {

    private String user_name;
    private String email;
    
    public UserDetailsDto(String user_name, String email) {
        this.user_name = user_name;
        this.email = email;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
