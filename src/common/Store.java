package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;

/**
 * Provides access to catalog information and records sales
 */
public interface Store extends Remote {

    /**
     * @param customer object with sale information to be recorded
     * @return a String formatted as a Sales Receipt
     * @throws RemoteException
     */
    public String recordSale(Customer customer) throws RemoteException;

    /**
     * @return HashMap of Item UPCs and Items
     * @throws RemoteException
     */
    public HashMap<String, Item> getCatalog() throws RemoteException;
}
