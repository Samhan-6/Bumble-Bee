package com.webapp.bumble.bee.dao;

import com.webapp.bumble.bee.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import java.time.LocalDate;


public class CustomerDAO {
    
    private Connection connection;
    
    public CustomerDAO(){
        // Initialize database connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bumblebee", "root", "root");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");
            while (resultSet.next()) {
                Customer customer = new Customer(
                        resultSet.getInt("customerId"),
                        resultSet.getString("fullName"),
                        resultSet.getDate("dateOfBirth").toLocalDate(),
                        resultSet.getString("emailAddress"),
                        resultSet.getString("phoneNumber"),
                        resultSet.getString("address"),
                        resultSet.getDouble("loanBalance"),
                        resultSet.getDouble("usedAmount"),
                        resultSet.getString("installmentPlan")
                );
                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }
    
    public Customer getCustomerById(int customerId) {
        Customer customer = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM customers WHERE CustomerID = ?");
            preparedStatement.setInt(1, customerId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                customer = new Customer(
                        resultSet.getInt("CustomerId"),
                        resultSet.getString("FullName"),
                        resultSet.getDate("DateOfBirth").toLocalDate(),
                        resultSet.getString("EmailAddress"),
                        resultSet.getString("PhoneNumber"),
                        resultSet.getString("Address"),
                        resultSet.getDouble("LoanBalance"),
                        resultSet.getDouble("UsedAmount"),
                        resultSet.getString("InstallmentPlan")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }
    
    public void addCustomer(Customer customer) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO customers (fullName, dateOfBirth, emailAddress, phoneNumber, address, loanBalance, usedAmount, installmentPlan) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, customer.getFullName());
            preparedStatement.setDate(2, java.sql.Date.valueOf(customer.getDateOfBirth()));
            preparedStatement.setString(3, customer.getEmailAddress());
            preparedStatement.setString(4, customer.getPhoneNumber());
            preparedStatement.setString(5, customer.getAddress());
            preparedStatement.setDouble(6, customer.getLoanBalance());
            preparedStatement.setDouble(7, customer.getUsedAmount());
            preparedStatement.setString(8, customer.getInstallmentPlan());
            preparedStatement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateCustomer(Customer customer){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "UPDATE customers SET fullName = ?, dateOfBirth = ?, emailAddress = ?, phoneNumber = ?, " +
                            "address = ?, loanBalance = ?, usedAmount = ?, installmentPlan = ? WHERE customerId = ?");
            preparedStatement.setString(1, customer.getFullName());
            preparedStatement.setDate(2, java.sql.Date.valueOf(customer.getDateOfBirth()));
            preparedStatement.setString(3, customer.getEmailAddress());
            preparedStatement.setString(4, customer.getPhoneNumber());
            preparedStatement.setString(5, customer.getAddress());
            preparedStatement.setDouble(6, customer.getLoanBalance());
            preparedStatement.setDouble(7, customer.getUsedAmount());
            preparedStatement.setString(8, customer.getInstallmentPlan());
            preparedStatement.setInt(9, customer.getCustomerId());
            preparedStatement.executeUpdate();
            System.out.println("Customer with ID " + customer.getCustomerId() + " updated successfully!");
            
        } catch (SQLException e) {            
            e.printStackTrace();
        }
        
    }
    
    public void deleteCustomer(int customerId) {
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                 "DELETE FROM customers WHERE customer_id = ?");
            preparedStatement.setInt(1, customerId);
            preparedStatement.executeUpdate();
            System.out.println("Customer with ID " + customerId + " deleted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
}
