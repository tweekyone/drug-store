package ru.tweekyone.drugstore.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Substance", schema = "public")
@NoArgsConstructor
@AllArgsConstructor
public class Substance {

    @Id
    @Column(name = "substance_id")
    @SequenceGenerator(name = "substance_id_seq", sequenceName = "substance_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "substance_id_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "pharm_group", nullable = false)
    private String pharmGroup;

    @Column(name = "is_vital", nullable = false)
    private Boolean isVital;

    @OneToMany(mappedBy = "substance", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Drug> drugs;
}

