package sakila.connect;

import org.springframework.data.repository.CrudRepository;

interface ActorRep extends CrudRepository<Actor,Integer> {}
interface FilmRep extends CrudRepository<Film,Integer> {}

