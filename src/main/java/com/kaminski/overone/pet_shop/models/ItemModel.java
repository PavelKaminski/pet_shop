package com.kaminski.overone.pet_shop.models;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "pet_shop")
@Data
public class ItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private String price;

    @Column(name = "weight")
    private String weight;

    @Column(name = "length")
    private String length;

    @Column(name = "width")
    private String width;

    @Column(name = "height")
    private String height;

    @Column(name = "description")
    private String description;

}
