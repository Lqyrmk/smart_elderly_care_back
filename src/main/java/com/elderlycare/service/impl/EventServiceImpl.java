package com.elderlycare.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.elderlycare.common.ResponseResult;
import com.elderlycare.entity.Event;
import com.elderlycare.entity.EventStatistic;
import com.elderlycare.mapper.EventMapper;
import com.elderlycare.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.elderlycare.utils.StatisticsConstants.MONTH_NUM;

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

    @Override
    public ResponseResult<Map<String, Object>> getEventTimeStatistics(Integer year) {

        Map<String, Object> statisticsMap = new HashMap<>();

        List<Integer> countList = new ArrayList<>();

        for (int i = 1; i <= MONTH_NUM; i++) {
            countList.add(eventMapper.countEventMonth(year, i));
        }

        statisticsMap.put("countMonthList", countList);

        return ResponseResult.success(statisticsMap, "事件发生时间数据统计完成");
    }

    @Override
    public ResponseResult<Map<String, Object>> getEventLocationStatistics(Integer year) {
        Map<String, Object> statisticsMap = new HashMap<>();

        List<EventStatistic> eventStatistics = eventMapper.countEventLocation(year);

        List<String> locationList = new ArrayList<>();
        List<Integer> countList = new ArrayList<>();

        for (EventStatistic item : eventStatistics) {
            locationList.add(item.getEventLocation());
            countList.add(item.getEventCount());
        }

        statisticsMap.put("locationList", locationList);
        statisticsMap.put("countList", countList);

        return ResponseResult.success(statisticsMap, "事件发生地点数据统计完成");
    }
}
