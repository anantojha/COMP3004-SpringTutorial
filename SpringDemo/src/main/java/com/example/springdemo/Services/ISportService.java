package com.example.springdemo.Services;

import com.example.springdemo.Models.Sport;

import java.util.ArrayList;

public interface ISportService {
    ArrayList<Sport> getAllSports();
    Sport getSportById(int id);
    Sport addSport(Sport sport);
    // Sport removeSport(int id);
}
