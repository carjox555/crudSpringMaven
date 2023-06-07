package com.crudspring.crud.repository;

import com.crudspring.crud.persistance.modells.BrandCarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntBrandCarCrudRepository extends JpaRepository<BrandCarEntity, Integer> {
}
