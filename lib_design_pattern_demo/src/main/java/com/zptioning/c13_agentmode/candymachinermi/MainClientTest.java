package com.zptioning.c13_agentmode.candymachinermi;

import java.rmi.Naming;

/**
 * @ClassName MainClientTest
 * @Author zptioning
 * @Date 2019/8/28 16:40
 * @Version 1.0
 * @Description 获取远程服务
 */
public class MainClientTest {

    public static void main(String[] args) {
        Monitor mMonitor = new Monitor();

        try {
            CandyMachineRemote mCandyMachine = (CandyMachineRemote) Naming.lookup("rmi://127.0.0.1:6602/test1");
            mMonitor.addMachine(mCandyMachine);
            mCandyMachine = (CandyMachineRemote) Naming.lookup("rmi://127.0.0.1:6602/test2");
            mMonitor.addMachine(mCandyMachine);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        mMonitor.report();
    }

}
