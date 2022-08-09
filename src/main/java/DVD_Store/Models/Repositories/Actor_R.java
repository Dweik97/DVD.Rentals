package DVD_Store.Models.Repositories;

import DVD_Store.Models.Filmography.Actor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Actor_R extends CrudRepository<Actor, Integer> {



    @Query("select a from Actor a WHERE a.actor_id = ?1")
    List<Actor> findActorById(int actor_id);

}
