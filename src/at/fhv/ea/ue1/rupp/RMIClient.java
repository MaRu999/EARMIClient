package at.fhv.ea.ue1.rupp;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.LinkedList;
import java.util.Scanner;

public class RMIClient {



    public static void main(String[] args) {

        SecurityManager sm =  new MySecurityManager();
        System.setSecurityManager(sm);
        Registry registry;
        System.out.println("Enter operand: ");
        Scanner scan = new Scanner(System.in);
        double operand = scan.nextDouble();
        System.out.println("Enter power: ");
        double power = scan.nextDouble();
        scan.close();

        try {
            registry = LocateRegistry.getRegistry("192.168.56.1", 2345); // gets the necessary registry for RMI

            IRMIServer stub = (IRMIServer) registry.lookup("IRMIServer"); // gets the bound
            // stub from the

            double result = stub.pow(operand, power);
            System.out.println("result = " + result);
            LinkedList<TestEntity> list = (LinkedList<TestEntity>) stub.getList();
            list.forEach(System.out::println);

        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}
