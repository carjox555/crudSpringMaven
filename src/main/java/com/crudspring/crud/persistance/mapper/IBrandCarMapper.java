package com.crudspring.crud.persistance.mapper;

import com.crudspring.crud.dominio.pojo.BrandCarPojo;
import com.crudspring.crud.persistance.modells.BrandCarEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper que transforma objetos de marcaCoche a Pojos o entidades
 */
@Mapper(componentModel = "spring")
public interface IBrandCarMapper {
    /**
     * source = entidad origen
     * target = entidad destino
     @param brandEntity Entidad a convertir
     @return Pojo convertido
     */
    @Mapping(source ="id", target = "id")
    BrandCarPojo toBrandCarPojo (BrandCarEntity brandEntity);


    /**
     * convierte un pojo a entidad de marca coche
     * @param brandPojo pojo a convertir
     * @return Entity convertido
     */
    @InheritInverseConfiguration // es para la inversa de lo q esta en mapping
    BrandCarEntity toBrandCarEntity (BrandCarPojo brandPojo);


    /**
     * Retorna una lista de marcas coche  transformada a pojo de una lista de entidades
     * @param brandsCarEntity Entidad a transformar
     * @return lista Transformada
     */
    List<BrandCarPojo> toBrandsCarPojo(List<BrandCarEntity> brandsCarEntity);
}
