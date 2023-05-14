package ru.zhuravlev.service;

import ru.zhuravlev.entity.StationModel;

import java.util.List;

public interface StationModelService {
    void create(StationModel stationModel);
    StationModel read (Long id);
    List<StationModel> readAll();
    boolean update(StationModel stationModel, Long id);
    boolean delete(Long id);
}
