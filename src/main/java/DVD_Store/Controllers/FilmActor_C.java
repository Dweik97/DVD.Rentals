package DVD_Store.Controllers;

import DVD_Store.Models.Filmography.FilmActor;
import DVD_Store.Models.Repositories.FilmActor_R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/filmactor")
public class FilmActor_C {

    @Autowired
    private final FilmActor_R filmActor_R;

    public FilmActor_C(FilmActor_R filmActor_R) {
        this.filmActor_R = filmActor_R;
    }

    //<editor-fold> desc = "GET Requests">

    @GetMapping("/view")
    public @ResponseBody
    Iterable<FilmActor> getAllFilmActor() {
        return filmActor_R.findAll();
    }
    //</editor-fold>

//    //<editor-fold> desc = "POST Requests">
//    @PostMapping("/add/{first_name}/{last_name}")
//    public @ResponseBody
//    Iterable<FilmActor> addNewFilmActor(@PathVariable String first_name, @PathVariable String last_name) {
//        FilmActor a = new FilmActor(first_name, last_name, new Date());
//        filmActor_R.save(a);
//        return filmActor_R.findAll();
//    }
//    //</editor-fold>

//    //<editor-fold> desc = "PATCH Requests">
//    @PatchMapping("/edit/{id}/{first_name}/{last_name}")
//    public ResponseEntity<FilmActor> updateFilmActor(@PathVariable int id, @PathVariable String first_name, @PathVariable String last_name) {
//        try {
//            FilmActor filmActor = filmActor_R.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FilmActor " + id + " not found"));
//            filmActor.setFirst_name(first_name);
//            filmActor.setLast_name(last_name);
//            filmActor.setLast_update(new Date());
//            return new ResponseEntity<Actor>(filmActor_R.save(filmActor), HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
////</editor-fold>

    //<editor-fold> desc = "Delete Requests">

    @DeleteMapping("/delete/{id}")
    public @ResponseBody
    Iterable<FilmActor> deleteFilmActorById(@PathVariable int id) {
        filmActor_R.deleteById(id);
        return filmActor_R.findAll();
    }
    //</editor-fold>
}