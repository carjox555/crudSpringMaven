package com.crudspring.crud.dominio.pojo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BrandCarPojo {


    private Integer id;
    private String description;
}
