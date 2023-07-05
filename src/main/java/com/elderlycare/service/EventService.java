package com.elderlycare.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.elderlycare.entity.Elderly;
import com.elderlycare.entity.Event;

/**
 * @Description
 * @Author YuanmingLiu
 * @Date 2023/7/6 0:09
 */
public interface EventService extends IService<Event> {

    /**
     * @description: 根据事件id查询事件信息
     * @author: YuanmingLiu
     * @date: 2023/7/6 0:30
     * @param: [eventId]
     * @return: com.elderlycare.entity.Event
     **/
    Event getEventInfoById(Long eventId);

}
