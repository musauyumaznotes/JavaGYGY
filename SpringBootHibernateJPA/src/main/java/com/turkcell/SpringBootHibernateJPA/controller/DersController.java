package com.turkcell.SpringBootHibernateJPA.controller;

import com.turkcell.SpringBootHibernateJPA.model.Ders;
import com.turkcell.SpringBootHibernateJPA.service.abstracts.DersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ders")
public class DersController {
    private DersService dersService;

    @GetMapping("/getall")
    public List<Ders> getAll() {
        return dersService.getAll();
    }

    @GetMapping("/getbyid/{id}")
    public Optional<Ders> getById(@PathVariable long id) {
        return dersService.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Ders data) {
        dersService.add(data);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Ders data) {
        dersService.delete(data);
    }

    @PutMapping("/update")
    public void update(@RequestBody Ders data) {
        dersService.update(data);
    }
}
