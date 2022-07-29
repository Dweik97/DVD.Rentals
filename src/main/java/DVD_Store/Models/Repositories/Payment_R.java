package DVD_Store.Models.Repositories;

import DVD_Store.Models.Administration.Payment;
import org.springframework.data.repository.CrudRepository;

public interface Payment_R extends CrudRepository<Payment, Integer> {
}
