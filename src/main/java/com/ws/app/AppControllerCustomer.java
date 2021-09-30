package com.ws.app;

import com.ws.model.CustomerEntity;
import com.ws.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ws")
public class AppControllerCustomer {


    @Autowired
    private ICustomerService service;

    @GetMapping("/findAllCustomers")
    public List<CustomerEntity> getCustomers(){
        return service.customers();
    }

    @PostMapping("/saveCustomer")
    public CustomerEntity saveCustomer(@RequestBody CustomerEntity customer){
        return service.save(customer);
    }

    @PutMapping("/updateCustomer/{id}")
    public CustomerEntity updateCustomer(@RequestBody CustomerEntity customer, @PathVariable("id") int id){
        return service.update(customer,id);
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public String deleteCustomer (@PathVariable("id") int id){
        return service.delete(id);
    }



}
