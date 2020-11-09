package co.unicauca.ordermanagement.domain.states;

import co.unicauca.ordermanagement.domain.Order;

/**
 *  estado pagado - estado adicionado
 * @author Jhonny Rosero
 * @author Jhonfer Ruiz
 */
public class PayedState extends OrderState{

    public PayedState(Order order) {
        super(order);
    }
    /**
     * @return description
     */
    @Override
    public String getStateDescription() {
        return "Pagada";
    }
    
    /**
     * @return nuevo estado como DeliveredState
     */
    @Override
    public OrderState orderSendOut() {
        if(!getOrder().isPaymentReceived()){
            throw new IllegalStateException("An order should not be send out when payment is not received.");
        }
        return new SendState(getOrder());
    }
}