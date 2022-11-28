package com.turkcell.SpringBootHibernateJPA.service.abstracts;

import java.util.List;
import java.util.Optional;

public interface BaseService<T> {
    List<T> getAll();
    Optional<T> getById(long id);
    void add(T data);
    void delete(T data);
    void update(T data);
}
