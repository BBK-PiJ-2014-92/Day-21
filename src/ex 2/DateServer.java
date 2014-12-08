import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;

public class DateServer extends UnicastRemoteObject implements DateService {
    public DateServer () throws RemoteException {

    }

    @Override
    public void date() {
        Calendar cal = Calendar.getInstance();
        int year = Calendar.getInstance().get(cal.YEAR);
        int month = Calendar.getInstance().get(cal.MONTH) + 1;
        int day = Calendar.getInstance().get(cal.DAY_OF_MONTH);
        int hour = Calendar.getInstance().get(cal.HOUR_OF_DAY);
        int minutes = Calendar.getInstance().get(cal.MINUTE);
        System.out.println(day + "/" + month + "/" + year + " " + hour + ":" + minutes);
    }
}