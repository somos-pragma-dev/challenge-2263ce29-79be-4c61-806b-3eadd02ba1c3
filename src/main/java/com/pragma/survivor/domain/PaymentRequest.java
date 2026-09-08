package com.pragma.survivor.domain;

import java.util.UUID;

public record PaymentRequest(
    UUID id,
    String channel,
    double amount,
    String idempotencyKey
) {}