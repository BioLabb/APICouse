package com.app.course.service;

import com.app.course.models.Buy;
import com.app.course.models.BuyKey;
import com.app.course.repository.RepositoryObject;
import org.springframework.http.ResponseEntity;

public interface BuyService {
    ResponseEntity<RepositoryObject> getAllBuy();
    ResponseEntity<RepositoryObject> getBuyById(BuyKey key);
    ResponseEntity<RepositoryObject> insertBuy(Buy buy);
    ResponseEntity<RepositoryObject> updateBuy(Buy buy, BuyKey key);
    ResponseEntity<RepositoryObject> deleteBuyById(BuyKey key);
}
