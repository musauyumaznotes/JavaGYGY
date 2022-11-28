package com.turkcell.SpringBootHibernateJPA.service.concretes;

import com.turkcell.SpringBootHibernateJPA.model.Ogretmen;
import com.turkcell.SpringBootHibernateJPA.repo.OgretmenRepository;
import com.turkcell.SpringBootHibernateJPA.service.abstracts.OgretmenService;

import java.util.List;
import java.util.Optional;

public class OgretmenManager implements OgretmenService {
    private OgretmenRepository ogretmenRepository;
    @Override
    public List<Ogretmen> getAll() {
        return ogretmenRepository.findAll();
    }

    @Override
    public Optional<Ogretmen> getById(long id) {
        return ogretmenRepository.findById(id);
    }

    @Override
    public void add(Ogretmen data) {
        ogretmenRepository.save(data);
    }

    @Override
    public void delete(Ogretmen data) {
        ogretmenRepository.delete(data);
    }

    @Override
    public void update(Ogretmen data) {
        var ogretmen = getById(data.getID());
        ogretmen.get().setNAME(data.getNAME());
        ogretmen.get().setISGICIK(data.isISGICIK());
        ogretmenRepository.save(ogretmen.get());
    }
}
