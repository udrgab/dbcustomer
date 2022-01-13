package com.project.customerservice.service.impl;

import com.project.customerservice.Person;
import com.project.customerservice.service.CustomerService;
import com.project.customerservice.service.DbServiceClient;
import org.springframework.stereotype.Service;



@Service
public class CustomerServiceImpl implements CustomerService {


//    private final DbServiceClient dbServiceClient;

    public CustomerServiceImpl(DbServiceClient dbServiceClient) {
       // return null;
    }

    @Override
    public Person getPerson(Long id) {
        return null;
        //return dbServiceClient.getPerson(id);
    }


}
