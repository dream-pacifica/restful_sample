/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restfulsample.rest.employee;

import com.example.restfulsample.entity.Employee;
import com.example.restfulsample.rest.BaseRequest;

/**
 * 社員情報更新Requestクラス
 * 
 * @author masaya.tezuka
 */
public class UpdateEmployeeRequest  extends BaseRequest {
    
    Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
