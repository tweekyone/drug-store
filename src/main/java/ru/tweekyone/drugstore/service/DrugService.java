package ru.tweekyone.drugstore.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tweekyone.drugstore.entity.Drug;
import ru.tweekyone.drugstore.repository.DrugRepository;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class DrugService {

    @Autowired
    private final DrugRepository drugRepository;

    @Transactional
    public Drug findById(Long drugId) {
        return drugRepository.findById(drugId).orElseThrow();
    }
}
