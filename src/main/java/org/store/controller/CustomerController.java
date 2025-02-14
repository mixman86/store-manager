package org.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.store.model.customer.Customer;

@RestController
public class CustomerController {

    @GetMapping("/customer")
    public String getCustomerById(@RequestParam String userId) {
        Customer customer = new Customer();
        customer.setUserId("TEST441");
        customer.setFirstName("Lance");
        customer.setLastName("Testerson");
        customer.setIsNewCustomer(false);
        customer.setHasCustomerRewards(false);

        if(customer.getUserId().equals(userId)) {
            return "The customer with that id belongs to " + customer.getFirstName() + " " + customer.getLastName();
        }
        else {
            return "No customer with this id exists.";
        }
    }
}
