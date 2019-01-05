package lk.ijse.dinemore.resource;

import lk.ijse.dinemore.entity.Chef;
import lk.ijse.dinemore.entity.Customer;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static final SessionFactory SESSION_FACTORY;

    private static StandardServiceRegistry registry;

    static {

        try {

            StandardServiceRegistry registry = new StandardServiceRegistryBuilder().loadProperties("application.properties").build();

            SESSION_FACTORY = new MetadataSources(registry)
                    .addAnnotatedClass(Customer.class)
                    .addAnnotatedClass(Chef.class)
                    .buildMetadata().buildSessionFactory();

        } catch (Throwable ex) {

            System.err.println("Initial SessionFactory creation faild." + ex);

            StandardServiceRegistryBuilder.destroy(registry);

            throw new ExceptionInInitializerError(ex);

        }

    }

    public static SessionFactory getSessionFactory() {

        return  SESSION_FACTORY;

    }
}
