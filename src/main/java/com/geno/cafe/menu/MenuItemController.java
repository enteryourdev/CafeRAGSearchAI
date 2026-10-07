package com.geno.cafe.menu;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class MenuItemController {
    private final MenuService menu;

    public MenuItemController(MenuService menu) {
        this.menu = menu;
    }

    @GetMapping
    public List<MenuItem> all() { return menu.findAll(); }

    @GetMapping("/{id}")
    public MenuItem one(@PathVariable Long id) { return menu.findById(Id); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MenuItem create(@RequestBody MenuItem item) {
        return menu.create(item); }

    @PutMapping("/{id}")
    public MenuItem update(@PathVariable Long id, @RequestBody MenuItem item) {
        return menu.update(id, item);
    }

    @DeleteMapping("/{id}")
    @ReponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        menu.delete(id);
    }


    
}
