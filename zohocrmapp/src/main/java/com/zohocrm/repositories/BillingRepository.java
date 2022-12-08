package com.zohocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.GenerateBill;

public interface BillingRepository extends JpaRepository<GenerateBill, Long> {

}
