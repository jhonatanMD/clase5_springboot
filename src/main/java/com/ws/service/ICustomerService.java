package com.ws.service;

import com.ws.model.CustomerEntity;

import java.util.List;

public interface ICustomerService {


    CustomerEntity save (CustomerEntity customer);

    List<CustomerEntity> customers ();

    CustomerEntity update(CustomerEntity customer , int id);

    String delete (int id);
}
