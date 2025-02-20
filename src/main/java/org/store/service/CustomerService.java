package org.store.service;

import org.store.model.user.Customer;

import java.util.Collection;
import java.util.HashMap;

public interface CustomerService {

    public abstract Customer getCustomerById(String id);

    public abstract Collection<Customer> getCustomersByIdArray(String[] ids);

    public abstract void addNewCustomer(Customer newCustomer);

    public abstract void updateCustomerInfoById(HashMap<String, String> updateFields);

    public abstract void deleteCustomerById(String id);
}
