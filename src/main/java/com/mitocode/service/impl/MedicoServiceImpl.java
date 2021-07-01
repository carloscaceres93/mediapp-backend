package com.mitocode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Medico;
import com.mitocode.repository.IGenericRepo;
import com.mitocode.repository.IMedicoRepo;
import com.mitocode.service.IMedicoService;

@Service
public class MedicoServiceImpl extends CRUDImpl<Medico, Integer> implements IMedicoService{

	@Autowired
	private IMedicoRepo repo;

	@Override
	protected IGenericRepo<Medico, Integer> getRepo() {
		return repo;
	}
	
	

}
