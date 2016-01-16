/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restfulsample.rest.employee;

import com.example.restfulsample.entity.result.employee.CreateEmployeeResult;
import com.example.restfulsample.entity.result.employee.GetEmployeeListResult;
import com.example.restfulsample.entity.result.employee.GetEmployeeResult;
import com.example.restfulsample.entity.result.employee.SearchEmplyoeeResult;
import com.example.restfulsample.rest.BaseResource;
import com.example.restfulsample.service.EmployeeService;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.log4j.Logger;

/**
 * 社員情報関連Resourceクラス
 *
 * @author masaya.tezuka
 */
@Path("employee")
public class EmployeeResource extends BaseResource {

    Logger logger = Logger.getLogger(EmployeeResource.class);

    /**
     * 社員情報関連Serviceクラス
     */
    private final EmployeeService service = new EmployeeService();
    
    /**
     * Creates a new instance of EmployeeResource
     */
    public EmployeeResource() {
    }

    /**
     * 社員情報登録
     * 
     * @param paramJson
     * @return 
     */
    @POST
    @Path("create")
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(String paramJson) {
        logger.info("create start");
        
        CreateEmployeeRequest request = generateRequestParam(paramJson, new CreateEmployeeRequest());

        // TODO 入力チェックを実装する
        
        CreateEmployeeResult result = service.createEmployee(request.getEmployee());
        
        // TODO IDを返却する
        Response response = generateResponse(result);

        logger.info("create end");
        
        return response;
    }

    /**
     * 社員情報取得
     * 
     * @param id
     * @return 
     */
    @GET
    @Path("show/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response show(@PathParam("id") Integer id) {
        logger.info("show start");
        
        GetEmployeeResult result = service.getEmployee(id);
        
        Response response = generateResponse(result);

        logger.info("show end");
        
        return response;
    }
    
    /**
     * 社員情報更新
     * 
     * @param id
     * @param paramJson
     * @return 
     */
    @PUT
    @Path("update/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") Integer id, String paramJson) {
        logger.info("update start");

        UpdateEmployeeRequest request = generateRequestParam(paramJson, new UpdateEmployeeRequest());

        // TODO 入力チェックを実装する
        
        service.updateEmployee(request.getEmployee());
        
        
        Response response = generateResponse();

        logger.info("update end");
        
        return response;
    }

    /**
     * 社員情報削除
     * 
     * @param id
     * @return 
     */
    @DELETE
    @Path("destory/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response destory(@PathParam("id") Integer id) {
        logger.info("destory start");

        service.deleteEmployee(id);
        
        Response response = generateResponse();

        logger.info("destory end");
        
        return response;
    }

    /**
     * 社員情報一覧取得
     * 
     * @param paramJson
     * @return 
     */
    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(String paramJson) {
        logger.info("list start");
        
        GetEmployeeListResult result = service.getEmployeeList();
        
        Response response = generateResponse(result);

        logger.info("list end");
        
        return response;
    }
    
    /**
     * 社員情報検索
     * 
     * @param name
     * @return 
     */
    @GET
    @Path("search")
    @Produces(MediaType.APPLICATION_JSON)
    public Response search(@QueryParam("name") String name) {
        logger.info("search start");
        
        // TODO QueryParamからなんの検索条件を受け取るか考える
        SearchEmplyoeeResult result = service.searchEmployee(name);
        
        Response response = generateResponse(result);

        logger.info("search end");
        
        return response;
    }
    
}
