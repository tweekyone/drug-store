package ru.tweekyone.drugstore.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "producer", schema = "public")
public class Producer {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "producer_id_seq", sequenceName = "producer_id_seq", initialValue = 1)
    @GeneratedValue(generator = "producer_id_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "country", nullable = false)
    private String country;

    @OneToMany(mappedBy = "producer", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Drug> drugs;
}
