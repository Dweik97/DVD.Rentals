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

    //<editor-fold> desc = "Delete Requests">

    @DeleteMapping("/delete/{id}")
    public @ResponseBody
    Iterable<FilmActor> deleteFilmActorById(@PathVariable int id) {
        filmActor_R.deleteById(id);
        return filmActor_R.findAll();
    }
    //</editor-fold>
}