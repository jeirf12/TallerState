package co.unicauca.ordermanagement.domain.states;

import co.unicauca.ordermanagement.domain.Order;

/**
 * Estado entregado
 *
 * @author Jhonfer Ruiz, Jhonny Rosero
 */
public class DeliveredState extends OrderState {

    /**
     * @param order to be processed
     */
    public DeliveredState(Order order) {
        super(order);
    }

    /**
     * @return description
     */
    @Override
    public String getStateDescription() {
        return "Entregada";
    }

    /**
     * @return true por orden finalizada
     */
    public boolean isFinished() {
        return true;
    }
}
