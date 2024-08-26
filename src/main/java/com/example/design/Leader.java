package com.example.design;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author czq
 * @date 2024/8/14 17:26
 * @Description:
 */

public class Leader extends Employee {
    private List<Employee> minions = new ArrayList<>();


    public void add(Employee employee) {
        minions.add(employee);
    }

    public void setMinions(List<Employee> minions) {
        this.minions = minions;
    }


}
