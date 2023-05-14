package ru.zhuravlev.service.impl;

import org.springframework.stereotype.Service;
import ru.zhuravlev.entity.Depos;
import ru.zhuravlev.entity.ListOfVagon;
import ru.zhuravlev.entity.StationModel;
import ru.zhuravlev.service.DeposService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DeposServiceImpl implements DeposService {
    private static final Map<Depos, Long> DEPOS_LONG_MAP = new HashMap<>();
    @Override
    public void create(Depos depos) {

    }

    @Override
    public Depos read(Long id) {
        return null;
    }

    @Override
    public List<Depos> readAll() {
        return null;
    }

    @Override
    public boolean update(Depos depos, Long id) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public String approaching(ListOfVagon listOfVagon, StationModel stationModel) {
        return null;
    }

    @Override
    public String rePositioning(ListOfVagon listOfVagon, StationModel stationModel) {
        return null;
    }

    @Override
    public String goOnWay(ListOfVagon listOfVagon) {
        return null;
    }
}
