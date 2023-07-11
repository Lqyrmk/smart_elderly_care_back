package com.elderlycare.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elderlycare.entity.Volunteer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description
 * @Author YuanmingLiu
 * @Date 2023/7/5 22:41
 */
@Mapper
public interface VolunteerMapper extends BaseMapper<Volunteer> {

    /**
     * @description: 统计某月份访问的义工数
     * @author: YuanmingLiu
     * @date: 2023/7/11 19:42
     * @param: [year, month]
     * @return: int
     **/
    int countVolunteerCheckInMonth(@Param("year") Integer year, @Param("month") Integer month);

    /**
     * @description: 统计某月份离开的义工数
     * @author: YuanmingLiu
     * @date: 2023/7/11 19:42
     * @param: [year, month]
     * @return: int
     **/
    int countVolunteerCheckOutMonth(@Param("year") Integer year, @Param("month") Integer month);
}
