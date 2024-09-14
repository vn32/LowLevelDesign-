package com.lld.Behavioral.design.pattern.template;

public class PayToMerchant extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate logic for PayToMerchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("2% charge for PayToMerchant");
    }

    @Override
    public void debitAmount() {
        System.out.println("debitAmount logic for PayToMerchant");
    }

    @Override
    public void creditAmount() {
        System.out.println("creditAmount logic for PayToMerchant");
    }
}
