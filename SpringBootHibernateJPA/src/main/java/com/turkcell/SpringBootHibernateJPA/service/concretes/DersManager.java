package com.turkcell.SpringBootHibernateJPA.service.concretes;

import com.turkcell.SpringBootHibernateJPA.model.Ders;
import com.turkcell.SpringBootHibernateJPA.repo.DersRepository;
import com.turkcell.SpringBootHibernateJPA.service.abstracts.DersService;

import java.util.List;
import java.util.Optional;

public class DersManager implements DersService {
    private DersRepository dersRepository;

    @Override
    public List<Ders> getAll() {
        return dersRepository.findAll();
    }

    @Override
    public Optional<Ders> getById(long id) {
        return dersRepository.findById(id);
    }

    @Override
    public void add(Ders data) {
        dersRepository.save(data);
    }

    @Override
    public void delete(Ders data) {
        dersRepository.delete(data);
    }

    @Override
    public void update(Ders data) {
        var ders = getById(data.getID());
        ders.get().setKonu(data.getKonu());
        ders.get().setOgretmen(data.getOgretmen());
        dersRepository.save(ders.get());
    }
}
