package DVD_Store.Models.Repositories;

import DVD_Store.Models.Filmography.Film;
import org.springframework.data.repository.CrudRepository;

public interface Film_R extends CrudRepository<Film, Integer> {}
