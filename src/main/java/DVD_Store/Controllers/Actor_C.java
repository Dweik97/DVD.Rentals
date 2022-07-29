package DVD_Store.Controllers;

import DVD_Store.Models.Filmography.Actor;
import DVD_Store.Models.Repositories.Actor_R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Date;
@RestController
@RequestMapping("/actors")
public class Actor_C {

    @Autowired
    private final Actor_R actor_R;

    public Actor_C(Actor_R actor_R) {
        this.actor_R = actor_R;
    }

    //<editor-fold> desc = "GET Requests">

    @GetMapping("/view")
    public @ResponseBody
    Iterable<Actor> getAllActor() {
        return actor_R.findAll();
    }
    //</editor-fold>

    //<editor-fold> desc = "POST Requests">
    @PostMapping("/add/{first_name}/{last_name}")
    public @ResponseBody
    Iterable<Actor> addNewActor(@PathVariable String first_name, @PathVariable String last_name) {
        Actor a = new Actor(first_name, last_name, new Date());
        actor_R.save(a);
        return actor_R.findAll();
    }
    //</editor-fold>

    //<editor-fold> desc = "PATCH Requests">
    @PatchMapping("/edit/{id}/{first_name}/{last_name}")
    public ResponseEntity<Actor> updateActor(@PathVariable int id, @PathVariable String first_name, @PathVariable String last_name) {
        try {
            Actor actor = actor_R.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Actor " + id + " not found"));
            actor.setFirst_name(first_name);
            actor.setLast_name(last_name);
            actor.setLast_update(new Date());
            return new ResponseEntity<Actor>(actor_R.save(actor), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//</editor-fold>

    //<editor-fold> desc = "Delete Requests">

    @DeleteMapping("/delete/{id}")
    public @ResponseBody
    Iterable<Actor> deleteActorById(@PathVariable int id) {
        actor_R.deleteById(id);
        return actor_R.findAll();
    }
    //</editor-fold>
}
