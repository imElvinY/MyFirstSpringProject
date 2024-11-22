package com.yusubov.MyFirstSpringProject.service;

import java.util.List;

public interface CommonService<T> {

    List<T> getAll();

    T getById(Integer id);

    T create(T element);

    void delete(Integer id);

    T update(Integer id, T element);


}
