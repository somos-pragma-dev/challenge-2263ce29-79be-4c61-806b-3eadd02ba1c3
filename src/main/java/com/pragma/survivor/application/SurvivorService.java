package com.pragma.survivor.application;

import com.pragma.survivor.domain.PaymentRequest;
import com.pragma.survivor.infrastructure.PaymentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class SurvivorService {

    private final PaymentRepository paymentRepository;

    public SurvivorService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Transactional
    public void processPayment(PaymentRequest paymentRequest) {
        // Lógica para manejar la solicitud de pago idempotente
        paymentRepository.save(paymentRequest);
    }
}