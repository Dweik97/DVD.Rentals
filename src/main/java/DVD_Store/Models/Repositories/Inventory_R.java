package DVD_Store.Models.Repositories;

import DVD_Store.Models.Administration.Inventory;
import org.springframework.data.repository.CrudRepository;

public interface Inventory_R extends CrudRepository<Inventory, Integer> {

//    @Query("SELECT " +
//            "    new DVD_Store.Models.Administration.Inventory(i.film_id, COUNT(i)) " +
//            "FROM " +
//            "    Inventory i " +
//            "GROUP BY " +
//            "    i.film_id")
//    List<Inventory> findCount();
}
