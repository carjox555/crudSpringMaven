package com.crudspring.crud.repository;

import com.crudspring.crud.dominio.pojo.BrandCarPojo;
import com.crudspring.crud.dominio.repository.IntBrandCarRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ImpBrandCarRepository implements IntBrandCarRepository {
    @Override
    public List<BrandCarPojo> getAll() {
        return null;
    }

    @Override
    public Optional<BrandCarPojo> getBrandCar(Integer id) {
        return Optional.empty();
    }

    @Override
    public BrandCarPojo save(BrandCarPojo newBrandCar) {
        return null;
    }

    @Override
    public void delete(Integer idBrandCar) {

    }
}
