package com.example.targetechgroup.services;

import com.example.targetechgroup.model.OperationRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CalculatorService {


    public double calculateValues(OperationRequest operationRequest) {
        String option = operationRequest.getOperation();
        double num1 = Double.parseDouble(operationRequest.getNumber1());
        double num2 = Double.parseDouble(operationRequest.getNumber2());

        if(option.equalsIgnoreCase("add"))
        {
            return num1+num2;
        }
        else if(option.equalsIgnoreCase("subtract"))
        {
            return num1-num2;
        }
        else if(option.equalsIgnoreCase("divide"))
        {
            return  num1/num2;
        }
        else if (option.equalsIgnoreCase("multiply"))
        {
            return num1*num2;
        }
        else
        {
            System.out.println(option + " doesn't exist");
            return 0;
        }

    }
}
