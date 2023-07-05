package com.elderlycare.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.elderlycare.common.ResponseResult;
import com.elderlycare.entity.User;

import java.util.Map;

/**
 * @Description
 * @Author YuanmingLiu
 * @Date 2023/3/18 16:47
 */
public interface UserService extends IService<User> {

    /**
     * @description: 用户登录
     * @author: YuanmingLiu
     * @date: 2023/7/5 14:54
     * @param: [user]
     * @return: com.elderlycare.common.ResponseResult<java.util.Map < java.lang.String, java.lang.Object>>
     **/
    ResponseResult<Map<String, Object>> login(User user);

    /**
     * @description: 用户退出登录
     * @author: YuanmingLiu
     * @date: 2023/7/5 14:55
     * @param: []
     * @return: com.elderlycare.common.ResponseResult<java.lang.String>
     **/
    ResponseResult<String> logout();

    /**
     * @description: 用户注册
     * @author: YuanmingLiu
     * @date: 2023/7/5 14:55
     * @param: [user]
     * @return: com.elderlycare.entity.User
     **/
    User register(User user);

    /**
     * @description: 修改密码
     * @author: YuanmingLiu
     * @date: 2023/7/5 14:55
     * @param: [userMap]
     * @return: int
     **/
    int modifyPassword(Map<String, Object> userMap);

    /**
     * @description: 修改用户信息
     * @author: YuanmingLiu
     * @date: 2023/7/5 14:57
     * @param: [userMap]
     * @return: int
     **/
    int modifyInfo(Map<String, Object> userMap);
}
