package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * Object that corresponds to a user of this POST program.
 * Adds items to a list and uses post to process a sale.
 */
public interface Customer extends Remote {

    /**
     * Add each item and its quantity to the ArrayList of type ItemTuple
     * @param UPC of the item
     * @param quantity per item
     * @throws RemoteException
     */
    public void addItem(String UPC, int quantity) throws RemoteException;

    /**
     * Total price of the Customer item
     * @param payment set for the customer
     * @throws RemoteException
     */
    public void addPayment(Payment payment) throws RemoteException;

    /**
     * List of Customer Item added to ArrayList
     * @return ArrayList of Item from the Customer cart
     * @throws RemoteException
     */
    public ArrayList<ItemTuple> getItems() throws RemoteException;

    /**
     * 
     * @return Payment of Total price customer owe
     * @throws RemoteException
     */
    public Payment getPayment() throws RemoteException;

    /**
     * 
     * @return The customer name
     * @throws RemoteException
     */
    public String getName() throws RemoteException;
}
