package ru.tweekyone.drugstore.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tweekyone.drugstore.entity.Drug;
import ru.tweekyone.drugstore.service.DrugService;

import javax.validation.constraints.NotNull;

@Validated
@RestController
@AllArgsConstructor
@RequestMapping("/drugs")
public class DrugController {

    @Autowired
    private final DrugService drugService;

    @GetMapping(value = "/{drugId}/id")
    public ResponseEntity<Drug> getDrugById(
            @PathVariable("drugId")
            @NotNull Long drugId) {
        return new ResponseEntity<>(drugService.findById(drugId), HttpStatus.OK);
    }
}
