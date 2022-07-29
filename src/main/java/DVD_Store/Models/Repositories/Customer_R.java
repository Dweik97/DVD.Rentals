package DVD_Store.Models.Repositories;

import DVD_Store.Models.Administration.Customer;
import org.springframework.data.repository.CrudRepository;

public interface Customer_R extends CrudRepository<Customer, Integer> {
}
