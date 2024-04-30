package com.suyad.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suyad.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Serializable> 
{

}
