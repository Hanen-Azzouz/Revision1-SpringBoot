package tn.esprit_3cinfogl1.revision1.DAO.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit_3cinfogl1.revision1.DAO.Entities.Magasin;
@Repository
public interface MagasinRepository extends CrudRepository<Magasin,Integer> {
}
