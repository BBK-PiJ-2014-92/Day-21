import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main (String [] args) {
        Client c = new Client();
        c.ServerLink();
    }
    public void ServerLink() {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 37);
            DateService d = (DateService) reg.lookup("date");
            d.date();
        } catch(RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}