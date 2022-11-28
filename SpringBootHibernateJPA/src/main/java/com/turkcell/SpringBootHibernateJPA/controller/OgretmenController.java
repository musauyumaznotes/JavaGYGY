package com.turkcell.SpringBootHibernateJPA.controller;

import com.turkcell.SpringBootHibernateJPA.model.Ogretmen;
import com.turkcell.SpringBootHibernateJPA.service.abstracts.OgretmenService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ogretmen")
public class OgretmenController {
    private OgretmenService ogretmenService;

    @GetMapping("/getall")
    public List<Ogretmen> getAll() {
        return ogretmenService.getAll();
    }

    @GetMapping("/getbyid/{id}")
    public Optional<Ogretmen> getById(@PathVariable long id) {
        return ogretmenService.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Ogretmen data) {
        ogretmenService.add(data);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Ogretmen data) {
        ogretmenService.delete(data);
    }

    @PutMapping("/update")
    public void update(@RequestBody Ogretmen data) {
        ogretmenService.update(data);
    }
}
