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

}
