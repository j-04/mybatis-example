package com.mybatis.example.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Subscriber {
    private Long id;
    private String name;
    private Tariff tariff;
    private List<Payment> payments;
}
