package memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Weslei
 */
public class Order {
    private StateOrder state;
    private List<StateOrder> memento = new ArrayList<StateOrder>();

    public StateOrder getState() {
        return this.state;
    }

    public void setState(StateOrder state) {
        this.state = state;
        this.memento.add(this.state);
    }

    public void restoreState(int index) {
        if (index < 0 || index > this.memento.size() - 1) {
            throw new IllegalArgumentException("Indice invalido");
        }
        this.state = this.memento.get(index);
    }

    public List<StateOrder> getStates() {
        return this.memento;
    }
}
