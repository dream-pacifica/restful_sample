/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restfulsample.service;

import com.example.restfulsample.entity.Employee;
import com.example.restfulsample.entity.result.employee.CreateEmployeeResult;
import com.example.restfulsample.entity.result.employee.GetEmployeeListResult;
import com.example.restfulsample.entity.result.employee.GetEmployeeResult;
import com.example.restfulsample.entity.result.employee.SearchEmplyoeeResult;
import java.util.ArrayList;
import java.util.List;

/**
 * 社員情報関連Serviceクラス
 * 
 * @author masaya.tezuka
 */
public class EmployeeService {

    /**
     * 社員情報登録処理
     * 
     * @param employee 登録する社員情報
     * @return
     */
    public CreateEmployeeResult createEmployee(Employee employee) {
        // 実際はDAOにアクセスして登録する
        CreateEmployeeResult result = new CreateEmployeeResult();
        result.setId(1);
        
        return result;
    }
    
    /**
     * 社員情報取得処理
     * 
     * @param id
     * @return
     */
    public GetEmployeeResult getEmployee(Integer id) {
        // 実際はDAOにアクセスして結果を取得する
        Employee employee = new Employee();
        employee.setId(id);
        employee.setLastName("山田");
        employee.setFirstName("太郎");

        GetEmployeeResult result = new GetEmployeeResult();
        result.setEmployee(employee);

        return result;
    }

    /**
     * 社員情報更新処理
     * 
     * @param employee 更新する社員情報
     */
    public void updateEmployee(Employee employee) {
        // 実際はDAOにアクセスして更新する
        
    }
    
    /**
     * 社員情報削除処理
     * 
     * @param id
     */
    public void deleteEmployee(Integer id) {
        // 実際はDAOにアクセスして削除する
        
    }

    /**
     * 社員情報一覧取得処理
     * 
     * @return
     */
    public GetEmployeeListResult getEmployeeList() {
        // 実際はDAOにアクセスして取得する
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setLastName("山田");
        emp1.setFirstName("太郎");
        employees.add(emp1);
        Employee emp2 = new Employee();
        emp2.setId(2);
        emp2.setLastName("田中");
        emp2.setFirstName("花子");
        employees.add(emp2);

        GetEmployeeListResult result = new GetEmployeeListResult();
        result.setEmployees(employees);
        result.setResultCount(2);
        
        return result;
    }

    /**
     * 社員情報検索処理
     * 
     * @param name 名前
     * @return 社員情報検索結果
     */
    public SearchEmplyoeeResult searchEmployee(String name) {
        // 実際はDAOにアクセスして検索する
        SearchEmplyoeeResult result = new SearchEmplyoeeResult();
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setLastName("山田");
        emp1.setFirstName("太郎");
        employees.add(emp1);
        Employee emp2 = new Employee();
        emp2.setId(2);
        emp2.setLastName("田中");
        emp2.setFirstName("花子");
        employees.add(emp2);
        result.setEmployees(employees);
        result.setResultCount(2);
        
        return result;
    }
}
