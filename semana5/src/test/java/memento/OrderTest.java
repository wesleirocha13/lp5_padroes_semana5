package memento;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class OrderTest {
    
    @Test
    public void mustStoreStates() {
        Order order = new Order();
        order.setState(StateOrderRequest.getInstance());
        order.setState(StateOrderCancel.getInstance());
        assertEquals(2, order.getStates().size());
    }

    @Test
    public void mustReturnInitialState() {
        Order order = new Order();
        order.setState(StateOrderRequest.getInstance());
        order.setState(StateOrderCancel.getInstance());
        order.restoreState(0);
        assertEquals(StateOrderRequest.getInstance(), order.getState());
    }
    
    @Test
    public void mustReturnPreviousState() {
        Order order = new Order();
        order.setState(StateOrderRequest.getInstance());
        order.setState(StateOrderFinish.getInstance());
        order.setState(StateOrderRate.getInstance());
        order.restoreState(1);
        assertEquals(StateOrderFinish.getInstance(), order.getState());
    }

    @Test
    public void mustReturnInvalidIndexException() {
        try {
            Order order = new Order();
            order.restoreState(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Indice invalido", e.getMessage());
        }
    }
    
    
}
