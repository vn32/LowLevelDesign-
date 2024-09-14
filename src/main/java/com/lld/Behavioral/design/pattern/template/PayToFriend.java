package com.lld.Behavioral.design.pattern.template;

public class PayToFriend extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate logic for PayToFriend");
    }

    @Override
    public void calculateFees() {
        System.out.println("0% logic for PayToFriend");
    }

    @Override
    public void debitAmount() {
        System.out.println("debitAmount logic for PayToFriend");
    }

    @Override
    public void creditAmount() {
        System.out.println("creditAmount logic for PayToFriend");
    }
}
