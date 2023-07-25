package com.CRMapplication.service;

import java.util.List;

import com.CRMapplication.entity.Lead;

public interface LeadService {

	public void createLead(Lead lead);

	public Lead getLeadById(long leadId);

	public void deleteLeadById(long leadId);

	public List<Lead> getAllLeads();

	
}
