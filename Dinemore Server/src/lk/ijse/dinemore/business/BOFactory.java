package lk.ijse.dinemore.business;

import lk.ijse.dinemore.business.custom.impl.ChefBOImpl;
import lk.ijse.dinemore.business.custom.impl.CustomerBOImpl;

public class BOFactory {

    public enum BOTypes{

        CUSTOMER,CHEF,DELIVERER,RECEPTION,FOOD_ITEM;

    }

    private static BOFactory boFactory;

    public BOFactory() {
    }

    public static BOFactory getInstance() {

        if (boFactory == null) {
            boFactory =  new BOFactory();
        }
        return boFactory;

    }

    public SuperBO getBO(BOTypes type) {

        switch (type){
            case CUSTOMER:
                return new CustomerBOImpl();
            case CHEF:
                return new ChefBOImpl();
                default:
                    return null;
        }

    }

}
