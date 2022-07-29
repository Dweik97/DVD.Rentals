package DVD_Store.Models.Repositories;

import DVD_Store.Models.Administration.Inventory;
import org.springframework.data.repository.CrudRepository;

public interface Inventory_R extends CrudRepository<Inventory, Integer> {
}
