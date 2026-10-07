//CRUD Controller
package com.geno.cafe.menu;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MenuService {
    private final MenuItemRepository repo;

    public MenuService(MenuItemRepository repo) {
        this.repo = repo;
    }
    public List<MenuItem> findAll() {
        return repo.findAll();
    }
    public MenuItem findById(Long id) {
        return repo.findById(id).orElseThrow(() -> new
    ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    public MenuItem create(MenuItem item) {
        return repo.save(item);
    }
    public MenuItem update(Long id, MenuItem changes){
        MenuItem item = findById(id);
        item.setName(changes.getName());
        item.setDescription(changes.getDescription());
        item.setCategory(changes.getCategory());
        item.setPrice(changes.getPrice());
        return repo.save(item);
    }
    public void delete(Long id){
        repo.deleteById(id);
    }
}