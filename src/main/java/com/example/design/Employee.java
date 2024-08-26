package com.example.design;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author czq
 * @date 2024/8/14 17:23
 * @Description:
 */
@Slf4j
@Data
public abstract class Employee {

    private String name;

    private BigDecimal salary;
}
