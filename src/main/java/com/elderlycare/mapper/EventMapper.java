package com.elderlycare.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elderlycare.entity.Event;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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

}
