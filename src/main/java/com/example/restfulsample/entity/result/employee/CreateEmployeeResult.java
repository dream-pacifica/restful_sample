/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restfulsample.entity.result.employee;

import com.example.restfulsample.entity.result.BaseResult;

/**
 * 社員情報登録Resultクラス
 * 
 * @author masaya.tezuka
 */
public class CreateEmployeeResult extends BaseResult {
    
    /**
     * id
     */
    Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
