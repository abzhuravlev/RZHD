package ru.zhuravlev.service.impl;

import org.springframework.stereotype.Service;
import ru.zhuravlev.entity.StationModel;
import ru.zhuravlev.service.StationModelService;

import java.util.List;

@Service
public class StationModelServiceImpl implements StationModelService {
    @Override
    public void create(StationModel stationModel) {

    }

    @Override
    public StationModel read(Long id) {
        return null;
    }

    @Override
    public List<StationModel> readAll() {
        return null;
    }

    @Override
    public boolean update(StationModel stationModel, Long id) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
