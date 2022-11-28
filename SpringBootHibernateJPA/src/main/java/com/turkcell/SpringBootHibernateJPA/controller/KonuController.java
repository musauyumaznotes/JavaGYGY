package com.turkcell.SpringBootHibernateJPA.controller;

import com.turkcell.SpringBootHibernateJPA.model.Ders;
import com.turkcell.SpringBootHibernateJPA.model.Konu;
import com.turkcell.SpringBootHibernateJPA.service.abstracts.DersService;
import com.turkcell.SpringBootHibernateJPA.service.abstracts.KonuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/konu")
public class KonuController {
    private KonuService konuService;

    @GetMapping("/getall")
    public List<Konu> getAll() {
        return konuService.getAll();
    }

    @GetMapping("/getbyid/{id}")
    public Optional<Konu> getById(@PathVariable long id) {
        return konuService.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Konu data) {
        konuService.add(data);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Konu data) {
        konuService.delete(data);
    }

    @PutMapping("/update")
    public void update(@RequestBody Konu data) {
        konuService.update(data);
    }
}
