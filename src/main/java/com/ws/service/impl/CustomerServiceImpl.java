package com.ws.service.impl;

import com.ws.model.CustomerEntity;
import com.ws.repository.CustomerRepository;
import com.ws.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public CustomerEntity save(CustomerEntity customer) {
        return repository.saveCustomer(customer);
    }

    @Override
    public List<CustomerEntity> customers() {
        return repository.getCustomers();
    }

    @Override
    public CustomerEntity update(CustomerEntity customer, int id) {
        return repository.updateCustomer(customer , id);
    }

    @Override
    public String delete(int id) {
        return repository.deleteCustomer(id);
    }
}
