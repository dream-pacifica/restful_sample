/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restfulsample.response;

/**
 * 基底レスポンスクラス
 * 
 * @author masaya.tezuka
 */
public class BaseResponse {

    /**
     * ステータスコード
     */
    private String statusCode;
    
    /**
     * メッセージ
     */
    private String messageDetail;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessageDetail() {
        return messageDetail;
    }

    public void setMessageDetail(String messageDetail) {
        this.messageDetail = messageDetail;
    }
    
}
