package com.CRMapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRMapplication.entity.Lead;
import com.CRMapplication.repository.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	private LeadRepository leadRepository;

	@Override
	public void createLead(Lead lead) {
		leadRepository.save(lead);
		

	}

	@Override
	public Lead getLeadById(long leadId) {
		// TODO Auto-generated method stub
		Optional<Lead> findById = leadRepository.findById(leadId);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteLeadById(long leadId) {
		leadRepository.deleteById(leadId);
		
	}

	@Override
	public List<Lead> getAllLeads() {
		// TODO Auto-generated method stub
		List<Lead> leads = leadRepository.findAll();
		return leads;
	}

}
