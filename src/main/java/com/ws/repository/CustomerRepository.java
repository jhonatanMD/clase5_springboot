package com.ws.repository;

import com.ws.model.CustomerEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {

    //VARIABLE DONDE SE VAN A GUARDAR MIS CLIENTES
    List<CustomerEntity> customersData = new ArrayList<>();


    //LISTAR TODOS LOS CLIENTE POR ID
    public CustomerEntity getCustomer(int id){

        return null;
    }

    //LISTAR TODOS LOS CLIENTES
    public List<CustomerEntity> getCustomers(){

        return customersData;
    }

    //GUARDAR CLIENTE
    public CustomerEntity saveCustomer(CustomerEntity customer){

        if(customersData.add(customer)){
            return customer;
        }

        throw new RuntimeException("NO SE GUARDO CLIENTE");
    }

    //ACTUALIZAR CLIENTE
    public CustomerEntity updateCustomer(CustomerEntity customer, int id){

        if(customersData.size() > 0 ){
            customer.setId(id);
            customersData.removeIf(c -> c.getId() == id);
            customersData.add(customer);

            return customer;
        }

        throw new RuntimeException("NO SE PUDO ACTUALIZAR EL CLIENTE CON ID "+id);
    }


    //ELIMINAR CLIENTE
    public String deleteCustomer(int id){

        // = ->   ASIGNAR
        // == ->  IGUALAR

        if(customersData.removeIf(c -> c.getId() == id)) {
            return "SE ELIMINO CLIENTE CON ID " + id;
        }

        return "NO SE PUEDO ELIMINAR EL CLIENTE PORQUE NO EXISTE";

    }

}
