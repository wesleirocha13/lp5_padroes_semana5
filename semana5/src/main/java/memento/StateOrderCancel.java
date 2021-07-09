package memento;

/**
 *
 * @author Weslei
 */
public class StateOrderCancel implements StateOrder{
    
    private StateOrderCancel() {};
    private static StateOrderCancel instance = new StateOrderCancel();
    public static StateOrderCancel getInstance() {
        return instance;
    }
    
    public String getState() {
        return "Cancelado";
    }
}
