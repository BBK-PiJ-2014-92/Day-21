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
            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
            EchoService e = (EchoService) reg.lookup("echo");
            e.echo("hello world");
        } catch(RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}