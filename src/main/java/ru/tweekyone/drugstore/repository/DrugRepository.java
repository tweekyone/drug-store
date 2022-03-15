package ru.tweekyone.drugstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tweekyone.drugstore.entity.Drug;

import java.util.Optional;

@Repository
public interface DrugRepository extends JpaRepository<Drug, Long> {

    @Override
    Optional<Drug> findById(Long drugId);
}
