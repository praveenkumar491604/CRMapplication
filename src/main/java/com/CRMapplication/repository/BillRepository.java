package com.CRMapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRMapplication.entity.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {

}
