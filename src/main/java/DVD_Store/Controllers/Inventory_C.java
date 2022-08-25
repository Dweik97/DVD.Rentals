package DVD_Store.Controllers;

import DVD_Store.Models.Administration.Inventory;
import DVD_Store.Models.Repositories.Inventory_R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/inventory")
public class Inventory_C {

    @Autowired
    private final Inventory_R inventory_R;

    public Inventory_C(Inventory_R inventory_R) {this.inventory_R = inventory_R;}

    //<editor-fold> desc = "GET Requests">

    @GetMapping("/view")
    public @ResponseBody
    Iterable<Inventory> getAllInventory() {
        return inventory_R.findAll();
    }
    //</editor-fold>

    //<editor-fold> desc = "Delete Requests">

    @DeleteMapping("/delete/{id}")
    public @ResponseBody
    Iterable<Inventory> deleteInventoryById(@PathVariable int id) {
        inventory_R.deleteById(id);
        return inventory_R.findAll();
    }
    //</editor-fold>
}