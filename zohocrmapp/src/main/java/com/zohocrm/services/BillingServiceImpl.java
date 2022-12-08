package com.zohocrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.GenerateBill;
import com.zohocrm.repositories.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billrepo;

	@Override
	public void saveOneBill(GenerateBill bill) {
		billrepo.save(bill);
	}

	@Override
	public List<GenerateBill> findAllBill() {
		List<GenerateBill> Bill = billrepo.findAll();
		return Bill;
	} 

}
