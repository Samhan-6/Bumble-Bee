package com.webapp.bumble.bee.service;

import com.webapp.bumble.bee.dao.CustomerDAO;
import com.webapp.bumble.bee.model.Customer;

import java.util.List;

public class CustomerService {
    
    private CustomerDAO customerDAO;
    
    public CustomerService() {
        this.customerDAO = new CustomerDAO();
    }
    
    public List<Customer> getAllCustomers() {
        return customerDAO.getAllCustomers();
    }
    
    public Customer getCustomerById(int customerId) {
        return customerDAO.getCustomerById(customerId);
    }
    
    public void addCustomer(Customer customer) {
        customerDAO.addCustomer(customer);
    }
    
    public void updateCustomer(Customer customer) {
        customerDAO.updateCustomer(customer);
    }
    
    public void deleteCustomer(int customerId) {
        customerDAO.deleteCustomer(customerId);
    }
    
}
