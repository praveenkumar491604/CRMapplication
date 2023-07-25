package com.CRMapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRMapplication.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
