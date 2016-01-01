/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restfulsample.service;

import com.example.restfulsample.model.Employee;
import com.example.restfulsample.result.employee.EmployeeDetailResult;

/**
 * 社員情報関連Serviceクラス
 * 
 * @author masaya.tezuka
 */
public class EmployeeService {

    /**
     * 社員情報詳細取得処理
     * 
     * @param id
     * @return 
     */
    public EmployeeDetailResult getEmployeeDetail(Integer id) {
        // 実際はDAOにアクセスして結果を取得する
        Employee employee = new Employee();
        employee.setId(id);
        employee.setLastName("山田");
        employee.setFirstName("太郎");

        EmployeeDetailResult result = new EmployeeDetailResult();
        result.setEmployee(employee);
        
        return result;
    }
    
}
