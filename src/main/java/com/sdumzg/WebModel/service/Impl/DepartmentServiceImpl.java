package com.sdumzg.WebModel.service.Impl;

import com.sdumzg.WebModel.dao.DepartmentDao;
import com.sdumzg.WebModel.model.DepartmentModel;
import com.sdumzg.WebModel.service.DepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentDao departmentDao;

    public long addDepartment(DepartmentModel departmentModel){return departmentDao.addDepartment(departmentModel);}
    public List<DepartmentModel> getDepartment(int page, int pageSize){
        return departmentDao.getDepartment(page,pageSize);}
    public List<DepartmentModel> getDepartmentAll(){return departmentDao.getDepartmentAll();}
    public int getDepartmentCount(){return departmentDao.getDepartmentCount();}

}
