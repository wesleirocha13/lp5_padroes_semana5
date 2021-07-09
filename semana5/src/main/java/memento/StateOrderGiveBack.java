package memento;

/**
 *
 * @author Weslei
 */
public class StateOrderGiveBack implements StateOrder{
    
    private StateOrderGiveBack() {};
    private static StateOrderGiveBack instance = new StateOrderGiveBack();
    public static StateOrderGiveBack getInstance() {
        return instance;
    }

    public String getState() {
        return "Devolvido";
    }
}
