package com.elderlycare.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elderlycare.entity.Event;
import com.elderlycare.entity.EventStatistic;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description
 * @Author YuanmingLiu
 * @Date 2023/7/6 0:09
 */
@Mapper
public interface EventMapper extends BaseMapper<Event> {

    /**
     * @description: 根据事件id查询事件信息第一步
     * @author: YuanmingLiu
     * @date: 2023/7/6 0:31
     * @param: [eventId]
     * @return: com.elderlycare.entity.Event
     **/
    Event selectEventByIdByStep1(@Param("eventId") Long eventId);

    /**
     * @description: 统计某月份发生的事件数
     * @author: YuanmingLiu
     * @date: 2023/7/11 20:01
     * @param: [year, month]
     * @return: int
     **/
    int countEventMonth(@Param("year") Integer year, @Param("month") Integer month);

    /**
     * @description: 统计各个地点发生的事件数
     * @author: YuanmingLiu
     * @date: 2023/7/11 20:10
     * @param: [year]
     * @return: java.util.List<com.elderlycare.entity.EventStatistic>
     **/
    List<EventStatistic> countEventLocation(@Param("year") Integer year);

}
