package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;

/**
 * Process Customer objects for checkout
 * .
 */
public interface Store extends Remote {

    /**
     * Processes Customer objects
     * and passes customer item list to checkout.
     * @param customer objects which is ready for checkout
     * @return true if customer is ready for checkout and
     * return false if there is any error in getting the item 
     * from the customer object.
     * @throws RemoteException
     */
    public boolean helpCustomer(Customer customer) throws RemoteException;

    /**
     *
     * @return particular item information from the Inventory using UPC
     * as String
     * @throws RemoteException
     */
    public HashMap<String, Item> getInventory() throws RemoteException;
}
