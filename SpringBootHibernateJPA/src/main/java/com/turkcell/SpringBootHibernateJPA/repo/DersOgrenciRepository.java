package com.turkcell.SpringBootHibernateJPA.repo;

import com.turkcell.SpringBootHibernateJPA.model.DersOgrenci;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DersOgrenciRepository extends JpaRepository<DersOgrenci,Long> {
}
