package DVD_Store.Models.Repositories;

import DVD_Store.Models.Filmography.Film;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Film_R extends CrudRepository<Film, Integer> {

    @Query("SELECT f from Film f WHERE upper(f.title) LIKE UPPER(concat('%', ?1, '%'))")
    List<Film> findByTitleIgnoreCase(String title);

    @Query("SELECT f from Film f WHERE upper(f.title) LIKE UPPER(concat('%', ?1, '%'))")
    List<Film> listActors(String title);

}