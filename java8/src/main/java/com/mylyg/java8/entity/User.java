package com.mylyg.java8.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class User {
    @NotBlank(message = "id不能为空")
    private String id;

    @NotBlank(message = "name不能为空")
    private String name;
}
