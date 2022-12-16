package com.blog.advancedmyblog.dto;

import lombok.Getter;

@Getter
public class StatusResponseDto {

    public StatusResponseDto(String statusCode, String msg) {
        this.statusCode = statusCode;
        this.msg = msg;
    }
    private String statusCode;
    private String msg;
}
