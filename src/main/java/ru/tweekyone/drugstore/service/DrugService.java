package ru.tweekyone.drugstore.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tweekyone.drugstore.controller.dto.response.DrugResponse;
import ru.tweekyone.drugstore.entity.Drug;
import ru.tweekyone.drugstore.repository.DrugRepository;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class DrugService {

    @Autowired
    private final DrugRepository drugRepository;

    @Transactional
    public DrugResponse findById(Long drugId) {
        Drug result = drugRepository.findById(drugId).orElseThrow();
        return new DrugResponse(
                result.getTradeName(),
                result.getSubstance().getName(),
                result.getPrice(),
                result.getMargin(),
                result.getWholesaleMargin(),
                result.getProducer().getName(),
                result.getOwner().getName(),
                result.getBalance(),
                result.getBestBefore(),
                result.getSeries(),
                result.getCode(),
                result.getCertificateNumber()
        );
    }
}
