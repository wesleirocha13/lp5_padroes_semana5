package observer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class CustomerTest {
    
    @Test
    public void mustNotifyOneCustomer() {
        int productValue = 30;
        int qtdStock = 3;
        Product product = new Product("Camiseta", "vermelha", productValue, qtdStock);
        Customer customer = new Customer("Weslei", "weslei@gmail.com");
        customer.register(product);
        product.checkForStock();
        assertEquals("Weslei o produto Camiseta vermelha chegou no estoque", customer.getLastEmailSent());
    }

    @Test
    public void mustNotifyCustomers() {
        int productValue = 30;
        int qtdStock = 3;
        Product product = new Product("Camiseta", "vermelha", productValue, qtdStock);
        Customer customer = new Customer("Weslei", "weslei@gmail.com");
        Customer customer2 = new Customer("Juca", "juca@gmail.com");
        customer.register(product);
        customer2.register(product);
        product.checkForStock();
        assertEquals("Weslei o produto Camiseta vermelha chegou no estoque", customer.getLastEmailSent());
        assertEquals("Juca o produto Camiseta vermelha chegou no estoque", customer2.getLastEmailSent());
    }
    
    @Test
    public void mustNotNotifyCustomer() {
        int productValue = 30;
        int qtdStock = 0;
        Product product = new Product("Camiseta", "vermelha", productValue, qtdStock);
        Customer customer = new Customer("Weslei", "weslei@gmail.com");
        customer.register(product);
        product.checkForStock();
        assertEquals(null, customer.getLastEmailSent());
    }
    
    @Test
    public void mustNotifyCustomerProductA() {
        int productValue = 30;
        int qtdStockA = 3;
        int qtdStockB = 0;
        Product productA = new Product("Camiseta", "vermelha", productValue, qtdStockA);
        Product productB = new Product("Camiseta", "branca", productValue, qtdStockB);
        Customer customer = new Customer("Weslei", "weslei@gmail.com");
        Customer customer2 = new Customer("Juca", "juca@gmail.com");
        customer.register(productA);
        customer2.register(productB);
        productA.checkForStock();
        productB.checkForStock();
        assertEquals("Weslei o produto Camiseta vermelha chegou no estoque", customer.getLastEmailSent());
        assertEquals(null, customer2.getLastEmailSent());
    }

    
}
