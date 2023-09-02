package com.app.course.service;

import com.app.course.models.Buy;
import com.app.course.models.BuyKey;
import com.app.course.repository.BuyRepository;
import com.app.course.repository.RepositoryObject;
import com.app.course.repository.Response;
import com.app.course.repository.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Optional;

@Service
public class BuyServiceIpm implements BuyService {
    private final String QUERY_SUCCESS = "QUERY BUY SUCCESSFULLY";
    private final String CAN_NOT_FOUND = "CANT NOT FOUND WITH ID: ";
    @Autowired
    BuyRepository repository;

    @Override
    public ResponseEntity<RepositoryObject> getAllBuy() {
        return Response.result(HttpStatus.OK, Status.OK, QUERY_SUCCESS, repository.findAll());
    }

    @Override
    public ResponseEntity<RepositoryObject> getBuyById(BuyKey id) {
        Optional<Buy> buy = repository.findById(id);
        return buy.isPresent() ?
                Response.result(HttpStatus.OK, Status.OK, QUERY_SUCCESS, repository.findAll()) :
                Response.result(HttpStatus.NOT_FOUND, Status.FAILED, CAN_NOT_FOUND + id);
    }

    @Override
    public ResponseEntity<RepositoryObject> insertBuy(Buy buy) {
        try {
            // value complete default is false
            buy.setStudentComplete(false);
            return Response.result(HttpStatus.OK, Status.OK, QUERY_SUCCESS, repository.save(buy));
        } catch (Exception e) {
            return Response.result(HttpStatus.NOT_IMPLEMENTED, Status.ERR, e.getMessage());
        }
    }

    @Override
    public ResponseEntity<RepositoryObject> updateBuy(Buy buy, BuyKey id) {
        return null;
    }

    @Override
    public ResponseEntity<RepositoryObject> deleteBuyById(BuyKey id) {
        boolean exist = repository.existsById(id);
        if(exist){
            repository.deleteById(id);
            return Response.result(HttpStatus.OK,Status.OK,QUERY_SUCCESS);
        }else {
            return Response.result(HttpStatus.NOT_FOUND,Status.FAILED,CAN_NOT_FOUND + id);
        }
    }
}
