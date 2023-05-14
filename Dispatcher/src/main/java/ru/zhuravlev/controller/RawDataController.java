package ru.zhuravlev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.zhuravlev.entity.RawData;
import ru.zhuravlev.service.RawDataService;

import java.util.List;

@RestController
public class RawDataController {
    private final RawDataService rawDataService;

    @Autowired
    public RawDataController( RawDataService rawDataService) {
        this.rawDataService = rawDataService;
    }

    @PostMapping(value = "/trains")
    public ResponseEntity<?> create(@RequestBody RawData rawData) {
        rawDataService.create(rawData);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(value = "/trains")
    public ResponseEntity<List<RawData>> read() {
        final List<RawData> rawDatas = rawDataService.readAll();

        return rawDatas !=null && !rawDatas.isEmpty()
                ? new ResponseEntity<>(rawDatas, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @GetMapping(value = "/trains/{id}")
    public ResponseEntity<RawData> read(@PathVariable(name = "id")Long id) {
        final RawData rawData = rawDataService.read(id);

        return rawData != null
                ? new ResponseEntity<>(rawData, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PutMapping(value = "/trains/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") Long id, @RequestBody RawData rawData) {
        final boolean updated = rawDataService.update(rawData, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
    @DeleteMapping(value = "/trains/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id")Long id) {
        final boolean deleted = rawDataService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
