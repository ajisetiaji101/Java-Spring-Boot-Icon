package com.example.crudmahasiswa.helpers;

import com.example.crudmahasiswa.models.ResponseDto;
import org.springframework.http.HttpStatus;

public class ResponseUtil {
    public static <T>ResponseDto<T> responseDtoSuccess(T data, String message) {
        return new ResponseDto<>(
                true,
                HttpStatus.OK.toString(),
                message,
                data
        );
    }

    public static <T> ResponseDto<T> responseDtoFailed(T data, String errorMessage) {
        return new ResponseDto<>(
                false,
                HttpStatus.OK.toString(),
                errorMessage,
                data
        );
    }

    public static <T> ResponseDto<T> responseDtoFailed(T data, String errorMessage, HttpStatus httpStatus) {
        return new ResponseDto<>(
                false,
                httpStatus.toString(),
                errorMessage,
                data
        );
    }
}
