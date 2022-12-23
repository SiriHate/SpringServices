package com.siri_hate.backend_service_2.controller;

import com.siri_hate.backend_service_2.model.Payment;
import com.siri_hate.backend_service_2.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/display_payment")
    public Optional<Payment> getPaymentById(@RequestParam Long id){
        return paymentService.getPayment(id);
    }

    @GetMapping("/display_all_payments")
    public List<Payment> getAllPayments(){
        return paymentService.getAllPayments();
    }

    @PostMapping("/add_payment")
    public Long addOrder(@RequestBody Payment payment){
        return paymentService.addPayment(payment);
    }

}