package com.crudspring.crud.controller;

import com.crudspring.crud.dominio.pojo.BrandCarPojo;
import com.crudspring.crud.dominio.service.IntBrandCarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api")
public class BrandCarController {

    private final IntBrandCarService intBrandCarService;

    public BrandCarController(IntBrandCarService intBrandCarService) {
        this.intBrandCarService = intBrandCarService;
    }

    /**
     * Devuelve lista de marcas coche
     * @return Http OK con lista de marcas
     */
    @GetMapping()
    public ResponseEntity<List<BrandCarPojo>> getAll(){
        return ResponseEntity.ok(intBrandCarService.getAll());
      //  return  ResponseEntity.status(HttpStatus.OK).body(intBrandCarService.getAll()); 2 ALTERNTIVA PARA CREAR RESPONSE
    }

    /**
     * devuelve una marca por id
     * @param id Id de la marca coche a buscar
     * @return HttpCode OK si la encuent
     */
    @GetMapping(path = "/{id}")
    public ResponseEntity<BrandCarPojo> getBrandCar(@PathVariable Integer id){
        return ResponseEntity.of(intBrandCarService.getBrandCar(id));
    }

    @PostMapping()
    public ResponseEntity<BrandCarPojo> save(@RequestBody BrandCarPojo brandCarPojoNew) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(intBrandCarService.save(brandCarPojoNew));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    /**
     *
     * @param brandCarPojoUpdate recibe marca a actualzar
     * @return marca actualizada
     */
    @PutMapping()
    public ResponseEntity<BrandCarPojo>update(@RequestBody BrandCarPojo brandCarPojoUpdate){
        return ResponseEntity.status(HttpStatus.OK)
                .body(intBrandCarService.save(brandCarPojoUpdate));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean>delete(@PathVariable Integer id){
        return new ResponseEntity<>(this.intBrandCarService.delete(id)? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
}
