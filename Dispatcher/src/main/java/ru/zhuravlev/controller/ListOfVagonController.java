package ru.zhuravlev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.zhuravlev.entity.ListOfVagon;
import ru.zhuravlev.service.ListOfVagonService;

import java.util.List;

@RestController
public class ListOfVagonController {
    private final ListOfVagonService listOfVagonService;
    @RequestMapping(value = "/list/home", method = RequestMethod.GET)
    String home() {
        return "home" +
                "juopa";
    }

    @Autowired
    public ListOfVagonController(ListOfVagonService listOfVagonService) {
        this.listOfVagonService = listOfVagonService;
    }
    @PostMapping(value = "/list")
    public ResponseEntity<?> create(@RequestBody ListOfVagon listOfVagon) {
        listOfVagonService.create(listOfVagon);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(value = "/list")
    public ResponseEntity<List<ListOfVagon>> read() {
        final List<ListOfVagon> listOfVagons = listOfVagonService.readAll();

        return listOfVagons != null && !listOfVagons.isEmpty()
                ? new ResponseEntity<>(listOfVagons, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @GetMapping(value = "/list/{id}")
    public ResponseEntity<ListOfVagon> read(@PathVariable(name = "id") Long id) {
        final ListOfVagon listOfVagon = listOfVagonService.read(id);

        return listOfVagon != null
                ? new ResponseEntity<>(listOfVagon, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PutMapping(value = "/list/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") Long id, @RequestBody ListOfVagon listOfVagon) {
        final boolean updated = listOfVagonService.update(listOfVagon, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
    @DeleteMapping(value = "/list/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Long id) {
        final boolean deleted = listOfVagonService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }



}
