package com.crudspring.crud.dominio.service;

import com.crudspring.crud.dominio.pojo.BrandCarPojo;

import java.util.List;
import java.util.Optional;

public interface IntBrandCarService {
    /**
     * Devuelve una lista con todas las marcas de coches
     * @return lista con marcas de coches
     */
    List<BrandCarPojo> getAll();

    /**
     * Devuelve una marca de coche por su Id
     * @param id
     * @return lista con marcas de coche
     */
    Optional<BrandCarPojo> getBrandCar(Integer id);

    /**
     * Guarda una nueva marca de coche
     * @param newBrandCar MArca coche a Guardar
     * @return Marca coche guardada
     */
    BrandCarPojo save (BrandCarPojo newBrandCar);

    /**
     * Elimina una marca coche dada su id
     * @param idBrandCar Id de la marca coche
     * @return true si se elimino falso si no
     */
    boolean delete(Integer idBrandCar);
}
