package com.weavernorth.domain;

import java.util.List;

/**
 * @Description: 菜单表
 * @Author: 王玉飞
 * @CreateDate: 2020-03-01 20:59
 * @UpdateUser: 王玉飞
 * @UpdateDate: 2020-03-01 20:59
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class MenuInfo {
    private Integer id;
    private Integer parentid;
    private String menuName;
    private List<Integer> roleIds;

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

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}
