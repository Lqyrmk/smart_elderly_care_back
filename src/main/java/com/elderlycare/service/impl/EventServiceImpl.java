package com.elderlycare.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.elderlycare.entity.Event;
import com.elderlycare.mapper.EventMapper;
import com.elderlycare.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author YuanmingLiu
 * @Date 2023/7/6 0:10
 */
@Service
public class EventServiceImpl extends ServiceImpl<EventMapper, Event> implements EventService {

    @Autowired
    private EventMapper eventMapper;

    @Override
    public Event getEventInfoById(Long eventId) {
        return eventMapper.selectEventByIdByStep1(eventId);
    }
}
