package com.weavernorth.domain;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: 王玉飞
 * @CreateDate: 2020-03-01 20:56
 * @UpdateUser: 王玉飞
 * @UpdateDate: 2020-03-01 20:56
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class UserInfo {
    //用户id
    private Integer id;
    //用户名称
    private String username;
    //登陆密码
    private String password;
    //登陆账号
    private String loginId;
    //人员状态
    private Integer state;
    //人员部门
    private Integer deptid;
    //角色表集合
    private List<Integer> roleIds;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public List<Integer> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Integer> roleIds) {
        this.roleIds = roleIds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }
}
