/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restfulsample.rest.employee;

import com.example.restfulsample.entity.Employee;
import com.example.restfulsample.rest.BaseRequest;

/**
 * 社員情報検索Requestクラス
 * 
 * @author masaya.tezuka
 */
public class SearchEmployeeRequest extends BaseRequest {
    
    Employee condtion = new Employee();

    public Employee getCondtion() {
        return condtion;
    }

    public void setCondtion(Employee condtion) {
        this.condtion = condtion;
    }
    
}
