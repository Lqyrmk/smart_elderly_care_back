package com.elderlycare.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elderlycare.entity.Elderly;
import com.elderlycare.entity.Event;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description
 * @Author YuanmingLiu
 * @Date 2023/7/5 23:54
 */
@Mapper
public interface ElderlyMapper extends BaseMapper<Elderly> {

    /**
     * @description: 根据事件id查询事件信息第二步
     * @author: YuanmingLiu
     * @date: 2023/7/6 0:33
     * @param: [elderlyId]
     * @return: com.elderlycare.entity.Elderly
     **/
    Elderly selectEventByIdByStep2(@Param("elderlyId") Long elderlyId);

    /**
     * @description: 统计小于某个年龄的老人数量
     * @author: YuanmingLiu
     * @date: 2023/7/11 17:21
     * @param: [elderlyAgeLowerLimits]
     * @return: int
     **/
    int countByAgeLessThan(@Param("elderlyAgeLowerLimits") Integer elderlyAgeLowerLimits);

    /**
     * @description: 统计大于等于某个年龄的老人数量
     * @author: YuanmingLiu
     * @date: 2023/7/11 17:22
     * @param: [elderlyAgeUpperLimits]
     * @return: int
     **/
    int countByAgeGreaterThanEqual(@Param("elderlyAgeUpperLimits") Integer elderlyAgeUpperLimits);

    /**
     * @description: 统计某个年龄区间内的老人数量
     * @author: YuanmingLiu
     * @date: 2023/7/11 17:22
     * @param: [elderlyAgeLow, elderlyAgeHigh]
     * @return: int
     **/
    int countByAgeBetween(@Param("elderlyAgeLow") Integer elderlyAgeLow,
                          @Param("elderlyAgeHigh") Integer elderlyAgeHigh);
}
