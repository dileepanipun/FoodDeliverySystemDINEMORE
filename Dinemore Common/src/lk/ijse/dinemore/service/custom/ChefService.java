package lk.ijse.dinemore.service.custom;

import lk.ijse.dinemore.model.ChefDTO;
import lk.ijse.dinemore.service.SuperService;

public interface ChefService extends SuperService {

    public boolean addChef(ChefDTO chefDTO) throws Exception;

}
