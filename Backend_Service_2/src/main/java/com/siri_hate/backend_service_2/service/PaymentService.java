package com.siri_hate.backend_service_2.service;

import com.siri_hate.backend_service_2.model.Payment;
import com.siri_hate.backend_service_2.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Optional<Payment> getPayment(Long id){
        return paymentRepository.findById(id);
    }

    public List<Payment> getAllPayments(){
        return paymentRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    public Long addPayment(Payment payment){
        return paymentRepository.saveAndFlush(payment).getId();
    }
}