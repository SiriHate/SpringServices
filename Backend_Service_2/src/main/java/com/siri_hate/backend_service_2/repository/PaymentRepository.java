package com.siri_hate.backend_service_2.repository;

import com.siri_hate.backend_service_2.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> { }