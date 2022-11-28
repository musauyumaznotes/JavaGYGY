package com.turkcell.SpringBootHibernateJPA.repo;

import com.turkcell.SpringBootHibernateJPA.model.Ders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DersRepository extends JpaRepository<Ders,Long> {
}
