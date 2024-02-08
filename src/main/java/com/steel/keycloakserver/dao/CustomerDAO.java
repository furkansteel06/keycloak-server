package com.steel.keycloakserver.dao;

import com.steel.keycloakserver.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
