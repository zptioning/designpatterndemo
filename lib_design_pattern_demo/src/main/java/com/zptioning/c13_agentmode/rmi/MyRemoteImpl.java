package com.zptioning.c13_agentmode.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    protected MyRemoteImpl() throws RemoteException {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello World!";
    }

    public static void main(String[] args) {

        /**
         * 注册服务
         */
        try {
            MyRemote service = new MyRemoteImpl();
            LocateRegistry.createRegistry(6600);
            Naming.rebind("rmi://127.0.0.1:6600/RemoteHello", service);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
