package com.sdumzg.WebModel.model;


public class DepartmentModel {
    private int id;
    private String name;
    private String parent_name;
    private String level;
    private String department_describe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent_name() {
        return parent_name;
    }

    public void setParent_name(String parent_name) {
        this.parent_name = parent_name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDepartment_describe() {
        return department_describe;
    }

    public void setDepartment_describe(String department_describe) {
        this.department_describe = department_describe;
    }
}
