package com.crudspring.crud.controller;

import com.crudspring.crud.dominio.pojo.BrandCarPojo;
import com.crudspring.crud.dominio.service.IntBrandCarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api")
public class BrandCarController {
    private final IntBrandCarService intBrandCarService;

    @GetMapping
    public ResponseEntity<List<BrandCarPojo>> getAll(){
        return ResponseEntity.ok(intBrandCarService.getAll());
      //  return  ResponseEntity.status(HttpStatus.OK).body(intBrandCarService.getAll()); 2 ALTERNTIVA PARA CREAR RESPONSE
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<BrandCarPojo> getBrandCar(@PathVariable Integer id){
        return ResponseEntity.of(intBrandCarService.getBrandCar(id));
    }

    @PostMapping(path = "nuevo")
    public ResponseEntity<BrandCarPojo> save(@RequestBody BrandCarPojo brandCarPojoNew) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(intBrandCarService.save(brandCarPojoNew));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

}
