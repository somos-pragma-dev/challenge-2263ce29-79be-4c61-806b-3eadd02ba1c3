package com.pragma.survivor.infrastructure;

import com.pragma.survivor.domain.PaymentRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentRequest, UUID> {}