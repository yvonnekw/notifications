package com.auction.notification.email;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter

public enum EmailTemplates {
    PAYMENT_CONFIRMATION("payment-confirmation.html", "Payment successfully processed"),
    ORDER_CONFIRMATION("order-confirmation.html", "Order confirmation"),
    BID_WINNER_CONFIRMATION("bid-winner-confirmation.html", "bid confirmation");


    private final String template;
    private final String subject;

    EmailTemplates(String template, String subject) {
        this.template = template;
        this.subject = subject;
    }


}
