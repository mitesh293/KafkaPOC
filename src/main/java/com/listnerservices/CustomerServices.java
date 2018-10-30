package com.listnerservices;

import com.model.Customer;
import com.model.Greetings;
import com.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServices {

    @Autowired
    CustomerRepository customerRepository;

    public void saveData(Greetings greetings){
        System.out.println("===================Save Customers to Cassandra===================");
        Customer cust_1 = new Customer(1, greetings.getFirstName(),greetings.getLastName(),greetings.getAge());

        // save customers to ElasticSearch
        customerRepository.save(cust_1);
    }
}
