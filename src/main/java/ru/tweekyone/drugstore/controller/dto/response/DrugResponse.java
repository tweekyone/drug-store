package ru.tweekyone.drugstore.controller.dto.response;

import lombok.*;
import ru.tweekyone.drugstore.entity.Owner;
import ru.tweekyone.drugstore.entity.Producer;
import ru.tweekyone.drugstore.entity.Substance;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class DrugResponse {

    private String tradeName;

    private String substance;

    private Double price;

    private Double margin;

    private Double wholesaleMargin;

    private String producer;

    private String owner;

    private Integer balance;

    private LocalDate bestBefore;

    private String series;

    private String code;

    private String certificateNumber;
}
