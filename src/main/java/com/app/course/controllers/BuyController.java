package com.app.course.controllers;

import com.app.course.models.Buy;
import com.app.course.models.BuyKey;
import com.app.course.repository.RepositoryObject;
import com.app.course.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/buy")
public class BuyController {
    @Autowired
    BuyService service;

    @GetMapping("")
    public ResponseEntity<RepositoryObject> getAllBuy() {
        return service.getAllBuy();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RepositoryObject> getBuyById(@RequestBody BuyKey id) {
        return service.getBuyById(id);
    }

    @PostMapping("")
    public ResponseEntity<RepositoryObject> insertBuy(@RequestBody Buy buy) {
        return service.insertBuy(buy);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<RepositoryObject> deleteBuyId(@RequestBody BuyKey id) {
        return service.deleteBuyById(id);
    }
}
