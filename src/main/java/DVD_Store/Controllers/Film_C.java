package DVD_Store.Controllers;

import DVD_Store.Models.Filmography.Film;
import DVD_Store.Models.Repositories.Film_R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController  //handles GET, POST, DELETE, PUT requests
@RequestMapping("/films")
public class Film_C {

    @Autowired
    private final Film_R film_R;

    public Film_C(Film_R film_R) {this.film_R = film_R;}

    //<editor-fold> desc = "GET Requests">

    @GetMapping("/view")
    public @ResponseBody
    Iterable<Film> getAllFilm() {

        return film_R.findAll();
    }

    @GetMapping("/search/{name}")
    public @ResponseBody
    Iterable<Film> searchFilms(@PathVariable String name) {
        return film_R.findByTitleIgnoreCase(name);
    }

    //</editor-fold>

    //<editor-fold> desc = "Delete Requests">

    @DeleteMapping("/delete/{id}")
    public @ResponseBody
    Iterable<Film> deleteFilmById(@PathVariable int id) {
        film_R.deleteById(id);
        return film_R.findAll();
    }
    //</editor-fold>
}
