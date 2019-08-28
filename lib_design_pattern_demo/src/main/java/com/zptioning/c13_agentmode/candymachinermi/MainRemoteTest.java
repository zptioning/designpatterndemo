package com.zptioning.c13_agentmode.candymachinermi;

import com.zptioning.c13_agentmode.candymachine.CandyMachine;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * @ClassName MainRemoteTest
 * @Author zptioning
 * @Date 2019/8/28 16:39
 * @Version 1.0
 * @Description 注册绑定远程服务
 */
public class MainRemoteTest {
	public static void main(String[] args) {

		try {
			CandyMachine service = new CandyMachine("test1", 7);
			LocateRegistry.createRegistry(6602);
			Naming.rebind("rmi://127.0.0.1:6602/test1", service);
			service.insertCoin();
			service = new CandyMachine("test2", 5);
			Naming.rebind("rmi://127.0.0.1:6602/test2", service);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.toString());
		}

	}
}
