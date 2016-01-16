/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restfulsample.rest;

import com.example.restfulsample.entity.result.BaseResult;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import net.arnx.jsonic.JSON;
import net.arnx.jsonic.JSONException;

/**
 * 基底Resourceクラス
 * 
 * @author masaya.tezuka
 */
public class BaseResource {

    /**
     * リクエストパラメータを生成します。
     *
     * @param <T>
     * @param jsonParam
     * @param request
     * @return
     * @throws JSONException
     */
    protected <T extends BaseRequest> T generateRequestParam(String jsonParam, T request) throws JSONException {

        JSON json = new JSON();
        json.setSuppressNull(true);

        return ( T ) json.parse(jsonParam, request.getClass());
    }

    /**
     * レスポンスを返却します。
     * 
     * @return response.
     */
    public Response generateResponse()  {
        return Response.ok().build();
    }
    
    /**
     * resultの内容を元にレスポンスを返却します。
     * 
     * @param <T>
     * @param result
     * 
     * @return response.
     */
    public <T extends BaseResult> Response generateResponse(T result) throws JSONException {
        JSON json = new JSON();
        json.setSuppressNull(true);
        
        return Response.ok(json.format(result), MediaType.APPLICATION_JSON).build();
    }
    
}
