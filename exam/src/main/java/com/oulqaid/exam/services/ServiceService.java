package com.oulqaid.exam.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oulqaid.exam.dao.IDao;
import com.oulqaid.exam.entities.Employe;
import com.oulqaid.exam.entities.Servicee;
import com.oulqaid.exam.repositories.ServiceRepository;

@Service
public class ServiceService implements IDao<Servicee> {
	@Autowired
	private ServiceRepository repository;
	
	

	@Override
	public Servicee create(Servicee o) {
		return repository.save(o);
	}

	@Override
	public boolean delete(Servicee o) {
		try {
			repository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Servicee update(Servicee o) {
		return repository.save(o);
	}

	@Override
	public List<Servicee> findAll() {
		return repository.findAll();
	}

	@Override
	public Servicee findById(Long id) {
		return repository.findById(id).orElse(null);
	}

}
