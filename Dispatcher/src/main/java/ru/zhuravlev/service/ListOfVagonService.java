package ru.zhuravlev.service;

import ru.zhuravlev.entity.ListOfVagon;

import java.util.List;

public interface ListOfVagonService {
    void create(ListOfVagon listOfVagon);
    ListOfVagon read(Long id);
    List<ListOfVagon> readAll();
    boolean update(ListOfVagon listOfVagon, Long id);
    boolean delete(Long id);

}
