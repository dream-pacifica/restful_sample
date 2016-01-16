/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restfulsample.entity.result.employee;

import com.example.restfulsample.entity.Employee;
import com.example.restfulsample.entity.result.BaseResult;

/**
 * 社員情報取得Resultクラス
 * 
 * @author masaya.tezuka
 */
public class GetEmployeeResult extends BaseResult {
    
    Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
}
