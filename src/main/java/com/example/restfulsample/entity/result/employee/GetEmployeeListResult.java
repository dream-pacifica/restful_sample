/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restfulsample.entity.result.employee;

import com.example.restfulsample.entity.Employee;
import com.example.restfulsample.entity.result.BaseResult;
import java.util.List;

/**
 * 社員情報一覧取得Resultクラス
 * 
 * @author masaya.tezuka
 */
public class GetEmployeeListResult extends BaseResult {

    /**
     * 取得件数
     */
    Integer resultCount;
    
    /**
     * 社員情報リスト
     */
    List<Employee> employees;

    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
}
