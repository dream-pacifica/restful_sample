/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restfulsample.result.employee;

import com.example.restfulsample.model.Employee;

/**
 * 社員情報詳細resultクラス
 * 
 * @author masaya.tezuka
 */
public class EmployeeDetailResult {

    /**
     * 社員情報詳細
     */
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
}
