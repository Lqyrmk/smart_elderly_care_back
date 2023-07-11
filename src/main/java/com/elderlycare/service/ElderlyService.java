package com.elderlycare.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.elderlycare.common.ResponseResult;
import com.elderlycare.entity.Elderly;

import java.util.Map;

/**
 * @Description
 * @Author YuanmingLiu
 * @Date 2023/7/5 23:54
 */
public interface ElderlyService extends IService<Elderly> {

    /**
     * @description: 根据老人年龄数据进行统计
     * @author: YuanmingLiu
     * @date: 2023/7/11 16:56
     * @param: [ageOffset]
     * @return: java.lang.Object
     **/
    ResponseResult<Map<String, Object>> getElderlyAgeStatistics(Integer ageOffset);

    /**
     * @description: 根据老人健康数据进行统计
     * @author: YuanmingLiu
     * @date: 2023/7/11 18:50
     * @param: []
     * @return: com.elderlycare.common.ResponseResult<java.util.Map<java.lang.String,java.lang.Object>>
     **/
    ResponseResult<Map<String, Object>> getElderlyHealthStatistics();

}
