package tn.esprit_3cinfogl1.revision1.DAO.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit_3cinfogl1.revision1.DAO.Entities.CarteFid;
@Repository
public interface CarteFidRepository extends CrudRepository<CarteFid,Integer> {
}
