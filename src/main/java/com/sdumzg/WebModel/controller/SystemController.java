package com.sdumzg.WebModel.controller;

import com.sdumzg.WebModel.model.DataModel;
import com.sdumzg.WebModel.service.DepartmentService;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@RequestMapping(value = "/manage")
@Controller
public class SystemController {

    public static Logger logger=Logger.getLogger(System.class);
    @Autowired
    private DepartmentService departmentService;

    @ResponseBody
    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    public List welcome(@RequestParam(value = "welcome",required = false)String welcome){
        List<String> list =  new ArrayList<String>();
        if (welcome==null){
            list.add("welcome page");
        }else {
            list.add(welcome);
        }
        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/getDepartment",method = RequestMethod.GET)
    public DataModel getDepartment(@Param("page") int page, @Param("pageSize") int pageSize){
        DataModel dataModel=new DataModel();
        dataModel.setTotal(departmentService.getDepartmentCount());
        dataModel.setList(departmentService.getDepartment(page,pageSize));
        return dataModel;
    }


    @ResponseBody
    @RequestMapping(value = "/getDepartmentAll",method = RequestMethod.GET)
    public DataModel getDepartmenAll(){
        DataModel dataModel=new DataModel();
        dataModel.setTotal(departmentService.getDepartmentCount());
        dataModel.setList(departmentService.getDepartmentAll());
        return dataModel;
    }
}
