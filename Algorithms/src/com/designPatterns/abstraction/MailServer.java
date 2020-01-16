package com.designPatterns.abstraction;

public class MailServer {
    public void sendEmail() {
        connect();
        authenticate();
        disconnect();
    }

    private void disconnect() {
        System.out.println("Disconnect");
    }

    private void authenticate() {
        System.out.println("Authenticate");
    }

    private void connect() {
        System.out.println("Connect");
    }
}
