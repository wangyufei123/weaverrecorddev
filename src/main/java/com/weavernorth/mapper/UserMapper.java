package com.weavernorth.mapper;

import com.weavernorth.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: 王玉飞
 * @CreateDate: 2020-03-01 13:47
 * @UpdateUser: 王玉飞
 * @UpdateDate: 2020-03-01 13:47
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Mapper
@Repository
public interface UserMapper {
    UserInfo getLoginUser(UserInfo userInfo);

}
