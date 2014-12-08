import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;

public class DataServer extends UnicastRemoteObject implements DateService {
    public DataServer () throws RemoteException {

    }

    @Override
    public void date() {
        Calendar calc = new Calendar();
        System.out.println(calc.getInstance().DATE + calc.getInstance().YEAR);
    }
}