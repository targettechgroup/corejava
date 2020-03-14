package com.example.targetechgroup.controller;

import com.example.targetechgroup.model.OperationRequest;
import com.example.targetechgroup.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/api/calculate")
    public ResponseEntity<?> calculate(@Valid @RequestBody OperationRequest operationRequest ) {
        System.out.println("calculate inside ......");
        double result = calculatorService.calculateValues(operationRequest);
        return ResponseEntity.ok(String.valueOf(result));
    }

}
