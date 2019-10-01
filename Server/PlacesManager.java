import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class PlacesManager extends UnicastRemoteObject implements PlacesListInterface{

    private static ArrayList allPlaces = new ArrayList();

    protected PlacesManager() throws RemoteException {
    }

    protected PlacesManager(int port) throws RemoteException {
        super(port);
    }

    protected PlacesManager(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
        super(port, csf, ssf);
    }

    @Override
    public void addPlace(Place p) throws RemoteException {
        allPlaces.add(p);
    }

    @Override
    public ArrayList allPlaces() throws RemoteException {
        return allPlaces;
    }
}
