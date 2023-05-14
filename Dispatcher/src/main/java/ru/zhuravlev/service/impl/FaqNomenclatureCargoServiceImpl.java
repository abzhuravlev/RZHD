package ru.zhuravlev.service.impl;

import org.springframework.stereotype.Service;
import ru.zhuravlev.entity.FaqNomenclatureCargo;
import ru.zhuravlev.entity.ListOfVagon;
import ru.zhuravlev.service.FaqNomenclatureCargoService;

import java.util.List;

@Service
public class FaqNomenclatureCargoServiceImpl implements FaqNomenclatureCargoService {
    @Override
    public void create(FaqNomenclatureCargo faqNomenclatureCargo) {

    }

    @Override
    public FaqNomenclatureCargo read(Long id) {
        return null;
    }

    @Override
    public List<FaqNomenclatureCargo> readAll() {
        return null;
    }

    @Override
    public boolean update(FaqNomenclatureCargo faqNomenclatureCargo, Long id) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
