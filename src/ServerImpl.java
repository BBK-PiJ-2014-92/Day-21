import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerImpl{

    public static void main (String [] args) {
        ServerImpl server = new ServerImpl();
        server.registerServer();
    }

    public void registerServer() {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("echo",new EchoServer());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}