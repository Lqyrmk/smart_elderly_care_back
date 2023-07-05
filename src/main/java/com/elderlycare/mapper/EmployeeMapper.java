package com.elderlycare.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elderlycare.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description
 * @Author YuanmingLiu
 * @Date 2023/7/5 23:27
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
