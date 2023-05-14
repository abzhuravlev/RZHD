package ru.zhuravlev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.zhuravlev.entity.FaqNomenclatureCargo;
import ru.zhuravlev.service.FaqNomenclatureCargoService;

import java.util.List;

@RestController
public class FaqNomenclatureCargoController {
    private final FaqNomenclatureCargoService faqNomenclatureCargoService;

    @Autowired
    public FaqNomenclatureCargoController(FaqNomenclatureCargoService faqNomenclatureCargoService) {
        this.faqNomenclatureCargoService = faqNomenclatureCargoService;
    }

    @PostMapping(value = "/nomenclatures")
        public ResponseEntity<?> create(FaqNomenclatureCargo faqNomenclatureCargo) {
        faqNomenclatureCargoService.create(faqNomenclatureCargo);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(value = "/nomenclatures")
    public ResponseEntity<List<FaqNomenclatureCargo>> read() {
        final List<FaqNomenclatureCargo> faqNomenclatureCargos = faqNomenclatureCargoService.readAll();

        return faqNomenclatureCargos != null && !faqNomenclatureCargos.isEmpty()
                ? new ResponseEntity<>(faqNomenclatureCargos, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @GetMapping(value = "/nomenclatures/{id}")
    public ResponseEntity<FaqNomenclatureCargo> read(@PathVariable(name = "id") Long id) {
        final FaqNomenclatureCargo faqNomenclatureCargo = faqNomenclatureCargoService.read(id);

        return faqNomenclatureCargo != null
                ? new ResponseEntity<>(faqNomenclatureCargo, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PutMapping(value = "/nomenclatures/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") Long id, @RequestBody FaqNomenclatureCargo faqNomenclatureCargo) {
     final  boolean updated = faqNomenclatureCargoService.update(faqNomenclatureCargo, id);

     return updated
             ? new ResponseEntity<>(HttpStatus.OK)
             : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
    @DeleteMapping(value = "/nomenclatures/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id")Long id) {
        final boolean deleted = faqNomenclatureCargoService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }


}
