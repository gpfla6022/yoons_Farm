package com.velpe.yoon.sfarm.domain.item.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_name")
    private String name;

    private int price;

    private int stock;

    private String desc;

    private LocalDateTime regDate;

    private LocalDateTime updateDate;

}
