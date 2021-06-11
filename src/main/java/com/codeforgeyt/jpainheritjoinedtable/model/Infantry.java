package com.codeforgeyt.jpainheritjoinedtable.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Infantry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private InfantryType type;
    private Integer moveSpeed;
    private Integer durability;
    private Integer attack;

    protected Infantry() {
    }

    protected Infantry(InfantryType type, Integer moveSpeed, Integer durability, Integer attack) {
        this.type = type;
        this.moveSpeed = moveSpeed;
        this.durability = durability;
        this.attack = attack;
    }
}
