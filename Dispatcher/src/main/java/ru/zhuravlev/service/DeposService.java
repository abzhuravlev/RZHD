package ru.zhuravlev.service;

import ru.zhuravlev.entity.Depos;
import ru.zhuravlev.entity.ListOfVagon;
import ru.zhuravlev.entity.StationModel;

import java.util.List;

public interface DeposService {
    void create(Depos depos);
    Depos read(Long id);
    List<Depos> readAll();
    boolean update(Depos depos, Long id);
    boolean delete(Long id);

    String approaching(ListOfVagon listOfVagon, StationModel stationModel);
    String rePositioning(ListOfVagon listOfVagon, StationModel stationModel);
    String goOnWay(ListOfVagon listOfVagon);
}
