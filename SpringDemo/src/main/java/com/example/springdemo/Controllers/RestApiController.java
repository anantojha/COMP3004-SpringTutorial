package com.example.springdemo.Controllers;

import com.example.springdemo.Models.Sport;
import com.example.springdemo.Services.ISportService;
import com.example.springdemo.Services.SportService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/sport")
public class RestApiController {

    ISportService sportService = new SportService();

    public RestApiController(){
        sportService.addSport(new Sport(1, "soccer"));
        sportService.addSport(new Sport(2, "basketball"));
        sportService.addSport(new Sport(3, "boxing"));
    }


    @GetMapping("")
    public ArrayList<Sport> getAllSports(){
        return sportService.getAllSports();
    }

    @GetMapping("/{id}")
    public Sport getSportById(@PathVariable int id){
        return sportService.getSportById(id);
    }

    @PostMapping()
    public Sport addSport(@RequestBody Sport sport){
        return sportService.addSport(sport);
    }

}
