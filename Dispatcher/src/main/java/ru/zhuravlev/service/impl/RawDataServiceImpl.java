package ru.zhuravlev.service.impl;

import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zhuravlev.dao.RawDataDAO;
import ru.zhuravlev.entity.RawData;
import ru.zhuravlev.service.RawDataService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RawDataServiceImpl implements RawDataService {
    private static final Map<RawData, Long> RAW_DATA_LONG_MAP = new HashMap<>();
    private final RawDataDAO rawDataDAO;


    @Autowired
    public RawDataServiceImpl(RawDataDAO rawDataDAO) {
        this.rawDataDAO = rawDataDAO;
    }

    @Override
    public void processTextMessage(Update update) {
    }

    @Override
    public void create(RawData rawData) {

    }

    @Override
    public List<RawData> readAll() {
        return null;
    }

    @Override
    public boolean update(RawData rawData, Long id) {
        return false;
    }


    @Override
    public RawData read(Long id) {
        return null;
        //return RAW_DATA_LONG_MAP.get(id);
    }


    @Override
    public boolean delete(Long id) {
        return false;
    }

}
