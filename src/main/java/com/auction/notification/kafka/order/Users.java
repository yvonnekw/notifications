package com.auction.notification.kafka.order;

public record Users(
        Long userId,
        String firstName,
        String lastName,
        String emailAddress
) {
}
