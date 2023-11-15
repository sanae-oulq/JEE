package com.oulqaid.exam.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oulqaid.exam.entities.Servicee;
import com.oulqaid.exam.services.ServiceService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/Servicee")
public class ServiceController {
	
	@Autowired
	private ServiceService ServiceeServicee;
	
	 @PostMapping("")
	    public ResponseEntity<Object> create(@RequestBody Servicee ServiceeDetails) {
	    	Servicee Servicee = ServiceeServicee.create(ServiceeDetails);
	        if (Servicee == null) {
	            return new ResponseEntity<>("Invalid request Data", HttpStatus.BAD_REQUEST);
	        } else {
	            return new ResponseEntity<>(Servicee, HttpStatus.OK);
	        }
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Object> delete(@PathVariable Long id) {
	    	Servicee Servicee = ServiceeServicee.findById(id);
	        if (Servicee == null) {
	            return new ResponseEntity<>("Servicee not found", HttpStatus.NOT_FOUND);
	        } else {
	            boolean deleted = ServiceeServicee.delete(Servicee);
	            if (deleted) {
	                return new ResponseEntity<>("Servicee deleted successfully", HttpStatus.OK);
	            } else {
	                return new ResponseEntity<>("Servicee associated to a user", HttpStatus.BAD_REQUEST);
	            }
	        }
	    }

	    @PutMapping("/{id}")
	    

	    @GetMapping("")
	    public ResponseEntity<List<Servicee>> findAll() {
	        return new ResponseEntity<>(ServiceeServicee.findAll(), HttpStatus.OK);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Object> findById(@PathVariable Long id) {
	    	Servicee Servicee = ServiceeServicee.findById(id);
	        if (Servicee == null) {
	            return new ResponseEntity<>("Servicee not found", HttpStatus.NOT_FOUND);
	        } else {
	            return new ResponseEntity<>(Servicee, HttpStatus.OK);
	        }
	    }
	}


