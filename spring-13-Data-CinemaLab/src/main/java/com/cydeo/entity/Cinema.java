package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@Data
public class Cinema extends BaseEntity {

    private String name;
    private String sponsoredName;

   // private Location location;


}
