package com.repository;

import com.model.Customer;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CassandraRepository<Customer, String> {

    @AllowFiltering
    public List<Customer> findByFirstname(String firstname);

    @AllowFiltering
    public List<Customer> findByAgeGreaterThan(int age);
}
