package org.store.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.store.model.user.Customer;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public Customer getCustomerById(String id) {
        return new Customer();
    }

    @Override
    public Collection<Customer> getCustomersByIdArray(String[] ids) {
        return List.of();
    }

    @Override
    public void addNewCustomer(Customer newCustomer) {

    }

    @Override
    public void updateCustomerInfoById(HashMap<String, String> updateFields) {

    }

    @Override
    public void deleteCustomerById(String id) {

    }
}
