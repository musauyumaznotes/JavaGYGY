package com.turkcell.SpringBootHibernateJPA.service.concretes;

import com.turkcell.SpringBootHibernateJPA.model.Ogrenci;
import com.turkcell.SpringBootHibernateJPA.repo.OgrenciRepository;
import com.turkcell.SpringBootHibernateJPA.service.abstracts.OgrenciService;

import java.util.List;
import java.util.Optional;

public class OgrenciManager implements OgrenciService {
    private OgrenciRepository ogrenciRepository;
    @Override
    public List<Ogrenci> getAll() {
        return ogrenciRepository.findAll();
    }

    @Override
    public Optional<Ogrenci> getById(long id) {
        return ogrenciRepository.findById(id);
    }

    @Override
    public void add(Ogrenci data) {
        ogrenciRepository.save(data);
    }

    @Override
    public void delete(Ogrenci data) {
        ogrenciRepository.delete(data);
    }

    @Override
    public void update(Ogrenci data) {
        var ogrenci = getById(data.getID());
        ogrenci.get().setNAME(data.getNAME());
        ogrenci.get().setOGRNUMBER(data.getOGRNUMBER());
        ogrenci.get().setYEAR(data.getYEAR());
        ogrenciRepository.save(ogrenci.get());
    }
}
