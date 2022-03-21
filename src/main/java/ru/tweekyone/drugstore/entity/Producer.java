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
@Table(name = "owner_producer", schema = "public")
public class Producer extends OPAbstractClass{

    @OneToMany(mappedBy = "producer", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Drug> drugs;
}
