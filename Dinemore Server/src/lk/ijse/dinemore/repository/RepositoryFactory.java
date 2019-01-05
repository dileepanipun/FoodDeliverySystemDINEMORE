package lk.ijse.dinemore.repository;

import lk.ijse.dinemore.repository.custom.impl.ChefRepositoryImpl;
import lk.ijse.dinemore.repository.custom.impl.CustomerRepositoryImpl;

public class RepositoryFactory {

    public enum RepositoryTypes{

        CUSTOMER,CHEF,ITEM,RECEPTION,DELIVERER;

    }

    public static RepositoryFactory repositoryFactory;

    private RepositoryFactory() {

    }

    public static RepositoryFactory getInstance() {

        if (repositoryFactory == null){
            repositoryFactory = new RepositoryFactory();
        }

        return repositoryFactory;

    }

    public SuperRepository getRepository(RepositoryTypes types){

        switch (types) {

            case CUSTOMER:
                return new CustomerRepositoryImpl();
            case CHEF:
                return new ChefRepositoryImpl();
                default:
                    return null;

        }

    }
}
