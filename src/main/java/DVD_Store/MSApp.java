package DVD_Store;

import DVD_Store.Address.Address_R;
import DVD_Store.Address.City_R;
import DVD_Store.Address.Country_R;
import DVD_Store.Administation.*;
import DVD_Store.Filmography.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Date;

@CrossOrigin(origins="*")
@SpringBootApplication
@RestController  //handles GET, POST, DELETE, PUT requests
@RequestMapping("/Sakila")
public class MSApp {

	//<editor-fold> desc = "Definitions">

	@Autowired
	private final Actor_R actor_R;
	private final Address_R address_R;
	private final Category_R category_R;
	private final City_R city_R;
	private final Country_R country_R;
	private final Customer_R customer_R;
	private final Film_R film_R;
	private final FilmActor_R filmActor_R;
	private final FilmCategory_R filmCategory_R;
	private final Inventory_R inventory_R;
	private final Language_R language_R;
	private final Payment_R payment_R;
	private final Rental_R rental_R;
	private final Staff_R staff_R;
	private final Store_R store_R;

	public MSApp(Actor_R actor_R, Address_R address_R, Category_R category_R, City_R city_R, Country_R country_R, Customer_R customer_R, Film_R film_R, FilmActor_R filmActor_R, FilmCategory_R filmCategory_R, Inventory_R inventory_R, Language_R language_R, Payment_R payment_R, Rental_R rental_R, Staff_R staff_R, Store_R store_R) {
		this.actor_R = actor_R;
		this.address_R = address_R;
		this.category_R = category_R;
		this.city_R = city_R;
		this.country_R = country_R;
		this.customer_R = customer_R;
		this.film_R = film_R;
		this.filmActor_R = filmActor_R;
		this.filmCategory_R = filmCategory_R;
		this.inventory_R = inventory_R;
		this.language_R = language_R;
		this.payment_R = payment_R;
		this.rental_R = rental_R;
		this.staff_R = staff_R;
		this.store_R = store_R;
	}

	//</editor-fold>

	public static void main(String[] args) {SpringApplication.run(MSApp.class, args);}

	//<editor-fold> desc = "GET Requests">
	@GetMapping("/actors")
	public @ResponseBody
	Iterable<Actor> getAllActor() {
		return actor_R.findAll();
	}
	//</editor-fold>

	//<editor-fold> desc = "POST Requests">
	@PostMapping("/add_actor/{first_name}/{last_name}")
	public @ResponseBody
	Iterable<Actor> addNewActor(@PathVariable String first_name, @PathVariable String last_name) {
		Actor a = new Actor(first_name, last_name, new Date());
		actor_R.save(a);
		return actor_R.findAll();
	}
	//</editor-fold>

	//<editor-fold> desc = "PATCH Requests">
	@PatchMapping("/edit_actor/{id}/{first_name}/{last_name}")
	public ResponseEntity<Actor> updateActor(@PathVariable int id, @PathVariable String first_name, @PathVariable String last_name) {
		try {
			Actor actor = actor_R.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Actor " + id + " not found"));
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

	@DeleteMapping("/delete_film")
	public @ResponseBody
	Iterable<Film> deleteFilmById(@PathVariable int id) {
		film_R.deleteById(id);
		return film_R.findAll();
	}
	//</editor-fold>

}

