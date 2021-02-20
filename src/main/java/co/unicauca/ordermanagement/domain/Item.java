package co.unicauca.ordermanagement.domain;

/**
 * Item del pedido, en el diagrama de clases aparece como Line
 *
 * @author Jhonfer Ruiz, Jhonny Rosero 
 */
public class Item {

    private Dish dish;
    private int quantity;

    public Item(Dish item, int quantity) {
        super();
        this.dish = item;
        this.quantity = quantity;
    }

    public Dish getItem() {
        return dish;
    }

    public int getQuantity() {
        return quantity;
    }
}
