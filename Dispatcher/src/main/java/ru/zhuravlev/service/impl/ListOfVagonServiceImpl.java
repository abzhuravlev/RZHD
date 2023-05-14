package ru.zhuravlev.service.impl;

import org.springframework.stereotype.Service;
import ru.zhuravlev.entity.ListOfVagon;
import ru.zhuravlev.service.ListOfVagonService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ListOfVagonServiceImpl implements ListOfVagonService {
    private static final Map<ListOfVagon, Long> LIST_OF_VAGON_LONG_MAP = new HashMap<>();
    @Override
    public void create(ListOfVagon listOfVagon) {

    }

    @Override
    public ListOfVagon read(Long id) {
        return null;
    }

    @Override
    public List<ListOfVagon> readAll() {
        return null;
    }


    @Override
    public boolean update(ListOfVagon listOfVagon, Long id) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
