package com.example.du.ws;


import org.junit.Test;

import java.rmi.RemoteException;

public class WSTest {

    public void sprawdzAtomaOfUniversa(SprawdzaczEmailowy validator) throws RemoteException {
        System.out.println(validator.sprawdzEmail("atom.of.universe@gmail.com"));
    }

    @Test
    public void test() throws RemoteException {
        sprawdzAtomaOfUniversa(new WSTestToSprawdzaczEmailowyAdapter(new EmailChecker()));
    }
}
