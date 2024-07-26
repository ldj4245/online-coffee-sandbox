package com.example.onlinecoffeesandbox.domain;


import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Getter
@Builder
public class CreateOrder {
    private int customerId;
    private Map<Integer,Integer> quantityByProduct; //["아이스아메리카노",3]
}
