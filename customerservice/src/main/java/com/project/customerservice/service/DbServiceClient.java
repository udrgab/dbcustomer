package com.project.customerservice.service;

import com.project.customerservice.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url="https://localhost:8080/api", value = "db-service")
public interface DbServiceClient {

    @RequestMapping(method = RequestMethod.GET,value = "/persons/{id}")
   Person getPerson(@PathVariable Long id);

    @RequestMapping(method=RequestMethod.PUT, value="/persons{id}", produces = "application/json")
    void updatePerson(@PathVariable("id") Long id);
}
