package observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Weslei
 */
public class Customer implements Observer{
    private String name;
    private String email;
    private String lastEmail;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getLastEmailSent() {
        return this.lastEmail;
    }

    public void register(Product product) {
        product.addObserver(this);
    }

    public void update(Observable product, Object arg1) {
        this.lastEmail = this.name + " o produto " + product.toString() + " chegou no estoque";
    }
}
