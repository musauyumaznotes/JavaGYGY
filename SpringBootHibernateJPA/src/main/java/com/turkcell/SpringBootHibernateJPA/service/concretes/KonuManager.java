package com.turkcell.SpringBootHibernateJPA.service.concretes;

import com.turkcell.SpringBootHibernateJPA.model.Konu;
import com.turkcell.SpringBootHibernateJPA.repo.KonuRepository;
import com.turkcell.SpringBootHibernateJPA.service.abstracts.KonuService;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class KonuManager implements KonuService {
    private KonuRepository konuRepository;
    @Override
    public List<Konu> getAll() {
        return konuRepository.findAll();
    }

    @Override
    public Optional<Konu> getById(long id) {
        return konuRepository.findById(id);
    }

    @Override
    public void add(Konu data) {
        konuRepository.save(data);
    }

    @Override
    public void delete(Konu data) {
        konuRepository.delete(data);
    }

    @Override
    public void update(Konu data) {
        var konu = getById(data.getID());
        konu.get().setNAME(data.getNAME());
        konuRepository.save(konu.get());
    }
}
