/*
Name: Pooja Anil Deshmukh 
Email: pooja.deshmukh1012@gmail.com

 */

package com.example.Sunbase1;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer,UUID> {


}
