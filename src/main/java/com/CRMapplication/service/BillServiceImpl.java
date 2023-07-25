package com.CRMapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRMapplication.entity.Bill;
import com.CRMapplication.repository.BillRepository;
@Service
public class BillServiceImpl implements BillService {
	@Autowired
	private BillRepository billRepository;

	@Override
	public void createBill(Bill bill) {
		billRepository.save(bill);
		

	}

}
