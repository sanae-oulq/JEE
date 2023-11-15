package com.oulqaid.exam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oulqaid.exam.entities.Servicee;

 

@Repository
public interface ServiceRepository extends JpaRepository<Servicee, Long> {

}
