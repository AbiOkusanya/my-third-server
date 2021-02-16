package com.example.mythirdserver.controller;

import com.example.mythirdserver.model.Tigers;
import com.example.mythirdserver.service.TigerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tigers")

public class TigerController {

    @Autowired
    TigerService tigerService;

    @GetMapping
    public  Iterable<Tigers> getTigers(){
        return tigerService.getTigers();
    }

    @GetMapping("/{id}")
    public Tigers getTigerById(@PathVariable Long id) {
        return tigerService.findTigerById(id);
    }
    @PostMapping
    public Tigers createTiger(@RequestBody Tigers tigers){
        return tigerService.createTiger(tigers);
    }
}


