package ru.tweekyone.drugstore.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "drug", schema = "public")
public class Drug {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "drug_id_seq", sequenceName = "drug_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "drug_id_seq")
    private Long id;

    @Column(name = "trade_name")
    private String tradeName;

    @ManyToOne
    private Substance substance;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "margin")
    private Double margin;

    @Column(name = "wholesale_margin")
    private Double wholesaleMargin;

    @ManyToOne
    private Producer producer;

    @ManyToOne
    private Owner owner;

    @Column(name = "balance")
    private Integer balance;

    @Column(name = "best_before", nullable = false)
    private LocalDate bestBefore;

    @Column(name = "series", nullable = false)
    private String series;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "certificate_number", nullable = false)
    private String certificateNumber;
}
