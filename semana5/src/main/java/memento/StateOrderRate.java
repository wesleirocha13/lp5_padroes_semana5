
package memento;

/**
 *
 * @author Weslei
 */
public class StateOrderRate implements StateOrder{
    
    private StateOrderRate() {};
    private static StateOrderRate instance = new StateOrderRate();
    public static StateOrderRate getInstance() {
        return instance;
    }

    public String getState() {
        return "Avaliado";
    }
}
