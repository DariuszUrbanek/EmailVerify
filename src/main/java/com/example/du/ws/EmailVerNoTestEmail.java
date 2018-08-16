/**
 * EmailVerNoTestEmail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.example.du.ws;


/*
 *  EmailVerNoTestEmail java interface
 */
public interface EmailVerNoTestEmail {
    /**
     * Auto generated method signature
     * This function will verify an email address and also includes the ability to timeout the verification process.  The Verification can be slowed down by the email server being verified against. &lt;b&gt;Timeout is in seconds&lt;/b&gt; Use a licensekey of 0 for testing &lt;br&gt; NOTE: A timeout error (7) does not mean an email will not go through.  You should treat this as a good email address.
     * @param advancedVerifyEmail0
     */
    public com.cdyne.ws.AdvancedVerifyEmailResponse advancedVerifyEmail(
            com.cdyne.ws.AdvancedVerifyEmail advancedVerifyEmail0)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * This function will verify an email address and also includes the ability to timeout the verification process.  The Verification can be slowed down by the email server being verified against. &lt;b&gt;Timeout is in seconds&lt;/b&gt; Use a licensekey of 0 for testing &lt;br&gt; NOTE: A timeout error (7) does not mean an email will not go through.  You should treat this as a good email address.
     * @param advancedVerifyEmail0
     */
    public void startadvancedVerifyEmail(
            com.cdyne.ws.AdvancedVerifyEmail advancedVerifyEmail0,
            final com.example.du.ws.EmailVerNoTestEmailCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * This function will give you all the possible code returns
     * @param returnCodes2
     */
    public com.cdyne.ws.ReturnCodesResponse returnCodes(
            com.cdyne.ws.ReturnCodes returnCodes2) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * This function will give you all the possible code returns
     * @param returnCodes2
     */
    public void startreturnCodes(com.cdyne.ws.ReturnCodes returnCodes2,
                                 final com.example.du.ws.EmailVerNoTestEmailCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * This function will verify the domains DNS (MX) mail entries.  If the function returns 0 the persons email domain is invalid.  More than 0 will indicate there is mail servers to accept an email.  This function is great for quick email domain verification.  It is not as powerful as the other email routines.  Use a LicenseKey of 0 for testing.  A -9999 as a result means that you have tested to many emails.  Please try again later if you get this value.
     * @param verifyMXRecord4
     */
    public com.cdyne.ws.VerifyMXRecordResponse verifyMXRecord(
            com.cdyne.ws.VerifyMXRecord verifyMXRecord4)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * This function will verify the domains DNS (MX) mail entries.  If the function returns 0 the persons email domain is invalid.  More than 0 will indicate there is mail servers to accept an email.  This function is great for quick email domain verification.  It is not as powerful as the other email routines.  Use a LicenseKey of 0 for testing.  A -9999 as a result means that you have tested to many emails.  Please try again later if you get this value.
     * @param verifyMXRecord4
     */
    public void startverifyMXRecord(
            com.cdyne.ws.VerifyMXRecord verifyMXRecord4,
            final com.example.du.ws.EmailVerNoTestEmailCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * This function allows you to verify an email address against the mail servers it belongs to.  This function differs from the advanced function only by it automatically setting a timeout of 5 seconds
     * @param verifyEmail6
     */
    public com.cdyne.ws.VerifyEmailResponse verifyEmail(
            com.cdyne.ws.VerifyEmail verifyEmail6) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * This function allows you to verify an email address against the mail servers it belongs to.  This function differs from the advanced function only by it automatically setting a timeout of 5 seconds
     * @param verifyEmail6
     */
    public void startverifyEmail(com.cdyne.ws.VerifyEmail verifyEmail6,
                                 final com.example.du.ws.EmailVerNoTestEmailCallbackHandler callback)
        throws java.rmi.RemoteException;

    //
}
