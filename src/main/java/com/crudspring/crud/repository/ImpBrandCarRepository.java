package com.crudspring.crud.repository;

import com.crudspring.crud.dominio.pojo.BrandCarPojo;
import com.crudspring.crud.dominio.repository.IntBrandCarRepository;
import com.crudspring.crud.persistance.mapper.IBrandCarMapper;
import com.crudspring.crud.persistance.modells.BrandCarEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repositorio de marca coche
 */
@Repository
@RequiredArgsConstructor
public class ImpBrandCarRepository implements IntBrandCarRepository {
    /**
     * Crud de marca coche
     */
    private final IntBrandCarCrudRepository intBrandCarCrudRepository;
    /**
     * Mapper de marca coche
     */

    private final IBrandCarMapper iBrandCarMapper;
    @Override
    public List<BrandCarPojo> getAll() {
        return iBrandCarMapper.toBrandsCarPojo(intBrandCarCrudRepository.findAll());
    }

    /**
     * LAMDA
     * return intBrandCarCrudRepository.findById(id).map(brandCarEntity -> iBrandCarMapper.toBrandCarPojo(brandCarEntity));
     * @param id Id de marca
     * @return Optional de marca coche encontrado
     * .map(iBrandCarMapper::toBrandCarPojo - metodo por referencia
     */
    @Override
    public Optional<BrandCarPojo> getBrandCar(Integer id) {
        return intBrandCarCrudRepository.findById(id)
                .map(iBrandCarMapper::toBrandCarPojo);
    }

    @Override
    public BrandCarPojo save(BrandCarPojo newBrandCar) {
        //Transformo la entidad al pojo
        BrandCarEntity brandCarEntity=iBrandCarMapper.toBrandCarEntity(newBrandCar);
        return iBrandCarMapper.toBrandCarPojo(intBrandCarCrudRepository.save(brandCarEntity));
    }

    /**
     * Elimina una marca con el id
     * @param idBrandCar Id de la marca coche
     */
    @Override
    public boolean delete(Integer idBrandCar) {
    intBrandCarCrudRepository.deleteById(idBrandCar);
    }
}
