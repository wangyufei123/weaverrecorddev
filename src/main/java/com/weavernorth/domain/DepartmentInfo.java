package com.weavernorth.domain;

/**
 * @Description: 部门实体类
 * @Author: 王玉飞
 * @CreateDate: 2020-03-01 21:00
 * @UpdateUser: 王玉飞
 * @UpdateDate: 2020-03-01 21:00
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class DepartmentInfo {
    private Integer id;
    private String departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
