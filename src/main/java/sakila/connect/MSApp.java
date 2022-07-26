package sakila.connect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@SpringBootApplication
@RestController  //handles GET, POST, DELETE, PUT requests
@RequestMapping("/Sakila")
public class MSApp {

	@Autowired
	//private final ActorRep actorRep;
	private final FilmRep filmRep;


	public static void main(String[] args) {
		SpringApplication.run(MSApp.class, args);
	}

	public MSApp(FilmRep filmRep) {
		this.filmRep = filmRep;
	}


	//@ResponseBody
	@PostMapping("/Add_New_Actor")
	public @ResponseBody String addNewActor(@RequestParam String title, @RequestParam double replacement_cost) {
		Film a = new Film(title, replacement_cost);
		System.out.println(title + " " + replacement_cost);
		filmRep.save(a);
		return "saved";
	}

	//Get request / read function
	@GetMapping("/All_Actors")
	public @ResponseBody
	Iterable<Film> getAllFilms() {
		return filmRep.findAll();
	}

	@DeleteMapping("/Delete_Actor_By_Id")
	public @ResponseBody
	void deleteActorById(@RequestParam int id) {
		filmRep.deleteById(id);
	}
}

//	public MSApp(ActorRep actorRep){
//		this.actorRep = actorRep;
//	}
//
//
//	//@ResponseBody
//	@PostMapping("/Add_New_Actor")
//	public @ResponseBody String addNewActor(@RequestParam String first_name, @RequestParam String last_name){
//		Actor a = new Actor(first_name, last_name);
//		System.out.println(first_name + " " + last_name);
//		actorRep.save(a);
//		return "saved";
//	}
//
//	//Get request / read function
//	@GetMapping("/All_Actors")
//	public @ResponseBody
//	Iterable<Actor>getAllActors(){
//		return actorRep.findAll();
//	}
//
//	@DeleteMapping("/Delete_Actor_By_Id")
//	public @ResponseBody
//	void deleteActorById(@RequestParam int id){
//		actorRep.deleteById(id);
//	}
//}
