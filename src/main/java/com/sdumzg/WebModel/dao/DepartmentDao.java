package com.sdumzg.WebModel.dao;

import com.sdumzg.WebModel.model.DepartmentModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentDao {
    long addDepartment(DepartmentModel departmentModel);
//    List<DepartmentModel> getDepartment(int page,int pageSize);
    List<DepartmentModel> getDepartment(@Param("page") int page,@Param("pageSize") int pageSize);
    List<DepartmentModel> getDepartmentAll();
    int getDepartmentCount();

}
