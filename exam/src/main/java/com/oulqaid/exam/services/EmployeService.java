package com.oulqaid.exam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oulqaid.exam.dao.IDao;
import com.oulqaid.exam.entities.Employe;
import com.oulqaid.exam.repositories.EmployeRepository;

@Service
public class EmployeService implements IDao<Employe> {
	
	@Autowired
	private EmployeRepository repository;

	@Override
	public Employe create(Employe o) {
		return repository.save(o);
	}

	@Override
	public boolean delete(Employe o) {
		try {
			repository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Employe update(Employe o) {
		return repository.save(o);

	}

	@Override
	public List<Employe> findAll() {
		return repository.findAll();
	}

	@Override
	public Employe findById(Long id) {
		return repository.findById(id).orElse(null);
	}

}
