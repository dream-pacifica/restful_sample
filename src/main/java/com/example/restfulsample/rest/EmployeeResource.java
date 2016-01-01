/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restfulsample.rest;

import com.example.restfulsample.model.Employee;
import com.example.restfulsample.response.employee.EmployeeDetailResponse;
import com.example.restfulsample.result.employee.EmployeeDetailResult;
import com.example.restfulsample.service.EmployeeService;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import net.arnx.jsonic.JSON;
import org.apache.log4j.Logger;

/**
 * 社員情報関連Resourceクラス
 *
 * @author masaya.tezuka
 */
@Path("employee")
public class EmployeeResource {

    Logger logger = Logger.getLogger(EmployeeResource.class);

    /**
     * 社員情報関連Serviceクラス
     */
    private final EmployeeService service = new EmployeeService();
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of EmployeeResource
     */
    public EmployeeResource() {
    }

    /**
     * スタッフ情報詳細取得
     * 
     * @param id
     * @return 
     */
    @GET
    @Path("detail/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getEmployeeDetail(@PathParam("id") Integer id) {
        logger.info("getEmployeeDetail start");
        
        EmployeeDetailResult result = service.getEmployeeDetail(id);
        Employee employee = result.getEmployee();
        
        // レスポンス作成
        EmployeeDetailResponse response = new EmployeeDetailResponse();
        response.setStatusCode("200");
        response.setMessageDetail("正常終了");
        // TODO responseに一括でセットできるようにする
        response.setId(employee.getId());
        response.setLastName(employee.getLastName());
        response.setFirstName(employee.getFirstName());
        
        String returnJson = JSON.encode(response);

        logger.info("getEmployeeDetail end");
        
        return returnJson;
    }

}
