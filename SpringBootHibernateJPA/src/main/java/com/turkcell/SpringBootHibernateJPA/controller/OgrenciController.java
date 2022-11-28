package com.turkcell.SpringBootHibernateJPA.controller;

import com.turkcell.SpringBootHibernateJPA.model.Ogrenci;
import com.turkcell.SpringBootHibernateJPA.service.abstracts.OgrenciService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ogrenci")
public class OgrenciController {
    private OgrenciService ogrenciService;

    @GetMapping("/getall")
    public List<Ogrenci> getAll() {
        return ogrenciService.getAll();
    }

    @GetMapping("/getbyid/{id}")
    public Optional<Ogrenci> getById(@PathVariable long id) {
        return ogrenciService.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Ogrenci data) {
        ogrenciService.add(data);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Ogrenci data) {
        ogrenciService.delete(data);
    }

    @PutMapping("/update")
    public void update(@RequestBody Ogrenci data) {
        ogrenciService.update(data);
    }
}