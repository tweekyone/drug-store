package ru.tweekyone.drugstore.entity;

import javax.persistence.*;

@MappedSuperclass
public abstract class OPAbstractClass {

    @Id
    @Column(name = "op_id")
    @SequenceGenerator(name = "owner_id_seq", sequenceName = "owner_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "owner_id_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "country", nullable = false)
    private String country;
}
