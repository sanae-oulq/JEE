package com.oulqaid.exam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oulqaid.exam.entities.Employe;

 

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
