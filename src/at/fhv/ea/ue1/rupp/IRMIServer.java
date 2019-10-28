package at.fhv.ea.ue1.rupp;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IRMIServer extends Remote {

    double pow(double operand, double toPower) throws RemoteException;

    List<TestEntity> getList() throws RemoteException;

}
