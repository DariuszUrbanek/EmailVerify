/**
 * EmailVerNoTestEmailCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package com.example.du.ws;


/**
 *  EmailVerNoTestEmailCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class EmailVerNoTestEmailCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public EmailVerNoTestEmailCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public EmailVerNoTestEmailCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for advancedVerifyEmail method
     * override this method for handling normal response from advancedVerifyEmail operation
     */
    public void receiveResultadvancedVerifyEmail(
        com.cdyne.ws.AdvancedVerifyEmailResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from advancedVerifyEmail operation
     */
    public void receiveErroradvancedVerifyEmail(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for returnCodes method
     * override this method for handling normal response from returnCodes operation
     */
    public void receiveResultreturnCodes(
        com.cdyne.ws.ReturnCodesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from returnCodes operation
     */
    public void receiveErrorreturnCodes(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for verifyMXRecord method
     * override this method for handling normal response from verifyMXRecord operation
     */
    public void receiveResultverifyMXRecord(
        com.cdyne.ws.VerifyMXRecordResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from verifyMXRecord operation
     */
    public void receiveErrorverifyMXRecord(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for verifyEmail method
     * override this method for handling normal response from verifyEmail operation
     */
    public void receiveResultverifyEmail(
        com.cdyne.ws.VerifyEmailResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from verifyEmail operation
     */
    public void receiveErrorverifyEmail(Exception e) {
    }
}
