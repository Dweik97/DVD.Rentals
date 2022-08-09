package DVD_Store.Controllers;

import DVD_Store.Models.Filmography.Category;
import DVD_Store.Models.Repositories.Category_R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/category")
public class Category_C {

    @Autowired
    private final Category_R Category_R;

    public Category_C(Category_R Category_R) {
        this.Category_R = Category_R;
    }

    //<editor-fold> desc = "GET Requests">

    @GetMapping("/view")
    public @ResponseBody
    Iterable<Category> getAllCategory() {
        return Category_R.findAll();
    }
    //</editor-fold>

    //<editor-fold> desc = "Delete Requests">

    @DeleteMapping("/delete/{id}")
    public @ResponseBody
    Iterable<Category> deleteCategoryById(@PathVariable int id) {
        Category_R.deleteById(id);
        return Category_R.findAll();
    }
    //</editor-fold>
}