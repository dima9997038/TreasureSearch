package WorldApp;

import model.Artifact;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IWorld extends Remote {

    Artifact explore(String seekerName, String sector, String field) throws RemoteException;
}
