/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restfulsample.response.employee;

import com.example.restfulsample.response.BaseResponse;

/**
 * スタッフ情報詳細レスポンスクラス
 * 
 * @author masaya.tezuka
 */
public class EmployeeDetailResponse extends BaseResponse {

    /**
     * ID
     */
    private Integer id;

    /**
     * 姓
     */
    private String lastName;

    /**
     * 名
     */
    private String firstName;

    /**
     * 姓（かな）
     */
    private String lastNameKana;

    /**
     * 名（かな）
     */
    private String firstNameKana;

    /**
     * 性別
     */
    private String gender;

    /**
     * 郵便番号
     */
    private String postalCode;
    
    /**
     * 住所1（都道府県）
     */
    private String address1;

    /**
     * 住所2（市区町村）
     */
    private String address2;

    /**
     * 住所3（町域名・番地）
     */
    private String address3;

    /**
     * 住所4（ビル名ほか）
     */
    private String address4;

    /**
     * 電話番号（自宅）
     */
    private String tel1;

    /**
     * 電話番号（携帯）
     */
    private String tel2;

    /**
     * メールアドレス（PC）
     */
    private String mailAddress1;

    /**
     * メールアドレス（携帯）
     */
    private String mailAddress2;

    // TODO
    /**
     * 生年月日
     */
    
    // TODO
    /**
     * 入社年月日
     */

    // TODO
    /**
     * 所属部署
     */
    
    // TODO
    /**
     * 役職
     */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNameKana() {
        return lastNameKana;
    }

    public void setLastNameKana(String lastNameKana) {
        this.lastNameKana = lastNameKana;
    }

    public String getFirstNameKana() {
        return firstNameKana;
    }

    public void setFirstNameKana(String firstNameKana) {
        this.firstNameKana = firstNameKana;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getMailAddress1() {
        return mailAddress1;
    }

    public void setMailAddress1(String mailAddress1) {
        this.mailAddress1 = mailAddress1;
    }

    public String getMailAddress2() {
        return mailAddress2;
    }

    public void setMailAddress2(String mailAddress2) {
        this.mailAddress2 = mailAddress2;
    }
    
}
