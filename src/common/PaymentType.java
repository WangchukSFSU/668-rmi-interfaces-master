import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Accepted payment types
 */
public interface PaymentType extends Remote {

    public enum PayType {

        CASH,
        CHECK,
        CREDIT;
    }

    public void setPayType(PayType payType) throws RemoteException;

    public String getCardNumber() throws RemoteException;

    public void setCardNumber(String cardNumber) throws RemoteException;

}
