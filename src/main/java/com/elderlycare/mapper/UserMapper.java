package com.elderlycare.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elderlycare.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description
 * @Author YuanmingLiu
 * @Date 2023/7/5 11:51
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
