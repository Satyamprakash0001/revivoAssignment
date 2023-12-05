package com.example.revivoAssignment.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.revivoAssignment.dtos.MainDto;

@RestController
public class BookingController {
    
    @PostMapping("/processData")
    public MainDto processData(@RequestBody MainDto mainDTO) {
        System.out.println("Executing processData method");
        System.out.println(mainDTO);
        return mainDTO;
    }
}
