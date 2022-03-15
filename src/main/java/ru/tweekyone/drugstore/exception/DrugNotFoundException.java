package ru.tweekyone.drugstore.exception;

public class DrugNotFoundException extends RuntimeException{
    public DrugNotFoundException(Long drugId) {
        super(String.format("Drug with id %s not found!", drugId));
    }
}
