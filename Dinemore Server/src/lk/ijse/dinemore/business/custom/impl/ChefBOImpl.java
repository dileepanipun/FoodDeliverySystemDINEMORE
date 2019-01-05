package lk.ijse.dinemore.business.custom.impl;

import lk.ijse.dinemore.business.custom.ChefBO;
import lk.ijse.dinemore.entity.Chef;
import lk.ijse.dinemore.model.ChefDTO;
import lk.ijse.dinemore.repository.RepositoryFactory;
import lk.ijse.dinemore.repository.custom.ChefRepository;
import lk.ijse.dinemore.resource.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class ChefBOImpl implements ChefBO {

    private ChefRepository chefRepository;

    public ChefBOImpl() {

        this.chefRepository = (ChefRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.CHEF);

    }

    @Override
    public boolean addChef(ChefDTO chef) throws Exception {

        try(Session session = HibernateUtil.getSessionFactory().openSession()){

            chefRepository.setSession(session);
            session.beginTransaction();

            Chef entity = new Chef(
                    chef.getChefID(),
                    chef.getChefName(),
                    chef.getAddress(),
                    chef.getSalary(),
                    chef.getTelephoneNo()
            );

            boolean saved = chefRepository.save(entity);

            session.getTransaction().commit();

            return saved;

        }

    }

    @Override
    public boolean updateChef(ChefDTO chef) throws Exception {
        return false;
    }

    @Override
    public boolean deleteChef(String chefID) throws Exception {
        return false;
    }

    @Override
    public List<ChefDTO> getAllChefs() throws Exception {
        return null;
    }
}
