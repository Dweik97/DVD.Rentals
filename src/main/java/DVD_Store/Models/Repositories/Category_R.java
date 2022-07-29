package DVD_Store.Models.Repositories;

import DVD_Store.Models.Filmography.Category;
import org.springframework.data.repository.CrudRepository;

public interface Category_R extends CrudRepository<Category, Integer> {
}
