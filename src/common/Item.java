package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.math.BigDecimal;

/**
 * Retrieves Item information from the Inventory for the POST
 * 
 */
public interface Item extends Remote {
  
    /**
     * Gets the price of the item from the Inventory
     * @return price of the item to the POST
     * @throws RemoteException
     */
    public BigDecimal getPrice() throws RemoteException;
  
    /**
     * Gets the description of the Item from the Inventory
     * @return Text of product description to the POST
     * @throws RemoteException
     */
    public String getDescription() throws RemoteException;
  
    /**
     * Gets the UPC of the Item from the Inventory
     * @return UPC in String type to the POST
     * @throws RemoteException
     */
    public String getUPC() throws RemoteException;

}
