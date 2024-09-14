package com.lld.Behavioral.design.pattern.template;

public class Main {
    public static void main(String[] args) {
        PaymentFlow paymentFlow=new PayToFriend();
        paymentFlow.sendMoney();
        paymentFlow=new PayToMerchant();
        paymentFlow.sendMoney();
    }
}
