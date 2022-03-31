package ru.tweekyone.drugstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@MappedSuperclass
@Getter
@Setter
public abstract class OPAbstractClass {

    @Id
    @Column(name = "op_id")
    @SequenceGenerator(name = "op_id_seq", sequenceName = "op_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "op_id_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "country", nullable = false)
    private String country;
}
