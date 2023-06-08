package com.crudspring.crud.dominio.service;

import com.crudspring.crud.dominio.pojo.BrandCarPojo;
import com.crudspring.crud.dominio.repository.IntBrandCarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@RequiredArgsConstructor
@Service
public class ImpBrandCarService implements IntBrandCarService{

    private  final IntBrandCarRepository intBrandCarRepository;

    public ImpBrandCarService(IntBrandCarRepository intBrandCarRepository) {
        this.intBrandCarRepository = intBrandCarRepository;
    }


    @Override
    public List<BrandCarPojo> getAll() {
        return intBrandCarRepository.getAll();
    }

    @Override
    public Optional<BrandCarPojo> getBrandCar(Integer id) {
        return intBrandCarRepository.getBrandCar(id);
    }

    @Override
    public BrandCarPojo save(BrandCarPojo newBrandCar) {
        return intBrandCarRepository.save(newBrandCar);
    }

    @Override
    public boolean delete(Integer idBrandCar) {
        try {
            intBrandCarRepository.delete(idBrandCar);
            return true;
        } catch (Exception e){
            return  false;
        }
    }
}
