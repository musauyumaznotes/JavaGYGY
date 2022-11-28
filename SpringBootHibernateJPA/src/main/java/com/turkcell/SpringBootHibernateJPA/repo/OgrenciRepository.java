package com.turkcell.SpringBootHibernateJPA.repo;

import com.turkcell.SpringBootHibernateJPA.model.Ogrenci;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OgrenciRepository extends JpaRepository<Ogrenci,Long> {
}
