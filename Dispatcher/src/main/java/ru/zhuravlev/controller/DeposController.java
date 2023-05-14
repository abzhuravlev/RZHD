package ru.zhuravlev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.zhuravlev.entity.Depos;
import ru.zhuravlev.service.DeposService;

import java.util.List;

@RestController
public class DeposController {
    private final DeposService deposService;

    @Autowired
    public DeposController(DeposService deposService) {
        this.deposService = deposService;
    }

    @PostMapping(value = "/depos")
    public ResponseEntity<?> create(@RequestBody Depos depos) {
        deposService.create(depos);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(value = "/depos")
    public ResponseEntity<List<Depos>> read() {
        final List<Depos> deposList = deposService.readAll();

        return deposList != null && deposList.isEmpty()
                ? new ResponseEntity<>(deposList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @GetMapping(value = "/depos/{id}")
    public ResponseEntity<Depos> read(@PathVariable(name = "id")Long id) {
        final Depos depos = deposService.read(id);

        return depos != null
                ? new ResponseEntity<>(depos, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
    @PutMapping(value = "/depos/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id")Long id, @RequestBody Depos depos) {
        final boolean updated = deposService.update(depos, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
    @DeleteMapping(value = "/depos/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Long id) {
        final boolean deleted = deposService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
