package com.kodilla.good.patterns.challanges;

public class SmsService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Sending sms to " + user.toString());
    }
}
