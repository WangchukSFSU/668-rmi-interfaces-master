package common;

import java.rmi.RemoteException;

/**
 *
 * CreditCard Payment
 */
public interface CreditCard extends Payment {

    /**
     *
     * @return CreditCard Number of the customer used for payment
     * @throws RemoteException
     */
    public String getCardNumber() throws RemoteException;
}
