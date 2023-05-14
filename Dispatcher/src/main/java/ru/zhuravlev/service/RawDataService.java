package ru.zhuravlev.service;

import org.hibernate.sql.Update;
import ru.zhuravlev.entity.RawData;

import java.util.List;

public interface RawDataService {
    void processTextMessage(Update update);
    void create(RawData rawData);
    RawData read(Long id);
    List<RawData> readAll();
    boolean update(RawData rawData, Long id);

    boolean delete(Long id);
}
