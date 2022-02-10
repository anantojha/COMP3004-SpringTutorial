package com.example.springdemo.Services;

import com.example.springdemo.Models.Sport;

import java.util.ArrayList;

public class SportService implements ISportService{

    ArrayList<Sport> sports = new ArrayList<>();

    @Override
    public ArrayList<Sport> getAllSports() {
        return sports;
    }

    @Override
    public Sport getSportById(int id) {
        for(Sport s: sports){
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }

    @Override
    public Sport addSport(Sport sport) {
        sports.add(sport);
        return sport;
    }
}
