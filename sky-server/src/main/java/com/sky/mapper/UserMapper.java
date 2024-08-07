package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    void insert(User user);

    /**
     *  根据openID查询用户
     * @param openId
     * @return
     */
    @Select("SELECT * from user where openid = #{openId}")
    User getByOpenId(String openId);

    @Select("SELECT * from user where id = #{id}")
    User getById(Long userId);
}
