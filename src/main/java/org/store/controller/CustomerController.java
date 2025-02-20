package org.store.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.store.model.user.Customer;
import org.store.service.CustomerServiceImpl;

@Slf4j
@RestController
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerServiceImpl;

    @GetMapping("/customer")
    public ResponseEntity<Customer> getCustomerById(@RequestParam String userId) {
        return new ResponseEntity<>(customerServiceImpl.getCustomerById(userId), HttpStatus.OK);
    }

    @PostMapping(path = "/customer/submit",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> submitNewCustomer(@RequestBody Customer newCustomer) {
        customerServiceImpl.addNewCustomer(newCustomer);
        return null;
    }
}
