package com.example.du.ws;

import java.rmi.RemoteException;

public interface SprawdzaczEmailowy {
    boolean sprawdzEmail(String email) throws RemoteException;
}
