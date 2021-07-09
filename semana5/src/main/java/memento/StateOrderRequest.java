package memento;

/**
 *
 * @author Weslei
 */
public class StateOrderRequest implements StateOrder{
    
    private StateOrderRequest() {};
    private static StateOrderRequest instance = new StateOrderRequest();
    public static StateOrderRequest getInstance() {
        return instance;
    }

    public String getState() {
        return "Solicitado";
    }
    
}
