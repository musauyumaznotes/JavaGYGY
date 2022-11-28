package com.turkcell.SpringBootHibernateJPA.repo;

import com.turkcell.SpringBootHibernateJPA.model.Konu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KonuRepository extends JpaRepository<Konu,Long> {
}
