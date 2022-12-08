package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.GenerateBill;

public interface BillingService {

	void saveOneBill(GenerateBill bill);

	List<GenerateBill> findAllBill();

}
