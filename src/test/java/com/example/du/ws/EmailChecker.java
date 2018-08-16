package com.example.du.ws;

import com.cdyne.ws.VerifyEmail;
import com.cdyne.ws.VerifyEmailResponse;
import org.junit.Test;

import java.rmi.RemoteException;

public class EmailChecker {

    public boolean checkEmail(String email) throws RemoteException {
        VerifyEmail verifyEmail = new VerifyEmail();
        verifyEmail.setEmail(email);
        verifyEmail.setLicenseKey("?");
        EmailVerNoTestEmailStub emailVerNoTestEmailStub = new EmailVerNoTestEmailStub();
        VerifyEmailResponse verifyEmailResponse = emailVerNoTestEmailStub.verifyEmail(verifyEmail);
//        System.out.println(verifyEmailResponse.getVerifyEmailResult().getGoodEmail());
//        System.out.println(verifyEmailResponse.getVerifyEmailResult().getResponseText());

        return verifyEmailResponse.getVerifyEmailResult().getGoodEmail();
    }
}
