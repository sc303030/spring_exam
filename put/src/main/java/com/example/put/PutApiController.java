package com.example.put;

import com.example.put.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put")
    public void put(@RequestBody PostRequestDto requestDto){
        System.out.println(requestDto);

    }

}
/* {
        "name" : "steve",
        "age" : 20,
        "car_list" : [
        {
        "name" : "BMW",
        "car_number" : "11가 1234",
        }
        ,{
        "name" : "A4",
        "car_number" : "22가 3456",
        }
        ]
        } */