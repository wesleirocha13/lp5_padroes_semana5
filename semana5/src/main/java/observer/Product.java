package observer;

import java.util.Observable;

/**
 *
 * @author Weslei
 */
public class Product extends Observable{

    private String name;
    private String description;
    private float value;
    private int qtdStock;
    
    public Product(String name, String description, float value, int qtdStock) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.qtdStock = qtdStock;
    }

    public void checkForStock() {
        if(qtdStock > 0){
            setChanged();
            notifyObservers(); 
        }        
    }

    @Override
    public String toString() {
        return name + " " + description;
    }
}
