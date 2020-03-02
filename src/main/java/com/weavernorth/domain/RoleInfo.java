package com.weavernorth.domain;

import java.util.List;

/**
 * @Description: 角色表实体类
 * @Author: 王玉飞
 * @CreateDate: 2020-03-01 20:58
 * @UpdateUser: 王玉飞
 * @UpdateDate: 2020-03-01 20:58
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class RoleInfo {

    private Integer id;
    private String roleName;
    private List<Integer> userIds;
    private List<Integer> menuIds;


    public List<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public List<Integer> getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(List<Integer> menuIds) {
        this.menuIds = menuIds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
