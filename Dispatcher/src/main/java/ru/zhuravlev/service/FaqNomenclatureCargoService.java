package ru.zhuravlev.service;

import ru.zhuravlev.entity.FaqNomenclatureCargo;

import java.util.List;

public interface FaqNomenclatureCargoService {
    void create (FaqNomenclatureCargo faqNomenclatureCargo);
    FaqNomenclatureCargo read(Long id);
    List<FaqNomenclatureCargo> readAll();
    boolean update (FaqNomenclatureCargo faqNomenclatureCargo, Long id);
    boolean delete(Long id);
}
