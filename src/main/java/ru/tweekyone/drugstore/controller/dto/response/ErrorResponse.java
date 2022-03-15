package ru.tweekyone.drugstore.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorResponse {
    private long errorCode;
    private String errorMessage;
}
