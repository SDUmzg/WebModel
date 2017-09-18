package com.sdumzg.WebModel.service;

import com.sdumzg.WebModel.model.DepartmentModel;

import java.util.List;

public interface DepartmentService {
    long addDepartment(DepartmentModel departmentModel);
    List<DepartmentModel> getDepartment(int page, int pageSize);
    List<DepartmentModel> getDepartmentAll();
    int getDepartmentCount();
}
