package ru.zhuravlev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.zhuravlev.entity.StationModel;
import ru.zhuravlev.service.StationModelService;

import java.util.List;

@RestController
public class StationModelController {
    private final StationModelService stationModelService;

    @Autowired
    public StationModelController(StationModelService stationModelService) {
        this.stationModelService = stationModelService;
    }

    @PostMapping(value = "/stations")
    public ResponseEntity<?> create(@RequestBody StationModel stationModel) {
        stationModelService.create(stationModel);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(value = "/stations")
    public ResponseEntity<List<StationModel>> read() {
        final List<StationModel> stationModels = stationModelService.readAll();

        return stationModels != null && !stationModels.isEmpty()
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
@GetMapping(value = "/stations/{id}")
    public ResponseEntity<StationModel> read(@PathVariable(name = "id")Long id) {
        final StationModel stationModel = stationModelService.read(id);

        return stationModel != null
                ? new ResponseEntity<>(stationModel, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
@PutMapping(value = "/stations/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id")Long id, @RequestBody StationModel stationModel) {
        final boolean updated = stationModelService.update(stationModel, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
    @DeleteMapping(value = "/stations/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id")Long id) {
        final boolean deleted = stationModelService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
