import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server{

    public static void main (String [] args) {
        Server server = new Server();
        server.registerServer();
    }

    public void registerServer() {
        try {
            Registry registry = LocateRegistry.createRegistry(37);
            registry.rebind("date",new DateServer());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}