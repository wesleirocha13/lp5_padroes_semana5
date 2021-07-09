package memento;

/**
 *
 * @author Weslei
 */
public class StateOrderFinish implements StateOrder{
    
    private StateOrderFinish() {};
    private static StateOrderFinish instance = new StateOrderFinish();
    public static StateOrderFinish getInstance() {
        return instance;
    }

    public String getState() {
        return "Finalizado";
    }
}
