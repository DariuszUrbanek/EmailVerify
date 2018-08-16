package com.example.du.ws;

import java.rmi.RemoteException;

public class WSTestToSprawdzaczEmailowyAdapter implements SprawdzaczEmailowy {

    private final EmailChecker adapted;

    public WSTestToSprawdzaczEmailowyAdapter(EmailChecker adapted){
            this.adapted = adapted;
    }



    public boolean sprawdzEmail(String email) throws RemoteException {
       return adapted.checkEmail(email);
    }
}
