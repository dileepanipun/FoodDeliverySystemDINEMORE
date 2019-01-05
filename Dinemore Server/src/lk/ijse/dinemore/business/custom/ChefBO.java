package lk.ijse.dinemore.business.custom;

import lk.ijse.dinemore.business.SuperBO;
import lk.ijse.dinemore.model.ChefDTO;

import java.util.List;

public interface ChefBO extends SuperBO {

    public boolean addChef(ChefDTO chef) throws Exception;

    public boolean updateChef(ChefDTO chef) throws Exception;

    public boolean deleteChef(String chefID) throws Exception;

    public List<ChefDTO> getAllChefs() throws Exception;
}
