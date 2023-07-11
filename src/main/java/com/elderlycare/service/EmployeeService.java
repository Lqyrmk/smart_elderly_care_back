package com.elderlycare.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.elderlycare.common.ResponseResult;
import com.elderlycare.entity.Employee;

import java.util.Map;

/**
 * @Description
 * @Author YuanmingLiu
 * @Date 2023/7/5 23:28
 */
public interface EmployeeService extends IService<Employee> {

    /**
     * @description: 根据工作人员离职入职时间数据进行统计
     * @author: YuanmingLiu
     * @date: 2023/7/11 19:16
     * @param: []
     * @return: com.elderlycare.common.ResponseResult<java.util.Map<java.lang.String,java.lang.Object>>
     **/
    ResponseResult<Map<String, Object>> getEmployeeTimeStatistics(Integer year);

}
