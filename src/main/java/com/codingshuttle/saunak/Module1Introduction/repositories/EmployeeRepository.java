package com.codingshuttle.saunak.Module1Introduction.repositories;

import com.codingshuttle.saunak.Module1Introduction.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
