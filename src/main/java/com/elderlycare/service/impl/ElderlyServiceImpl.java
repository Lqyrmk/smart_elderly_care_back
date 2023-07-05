package com.elderlycare.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.elderlycare.entity.Elderly;
import com.elderlycare.mapper.ElderlyMapper;
import com.elderlycare.service.ElderlyService;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author YuanmingLiu
 * @Date 2023/7/5 23:55
 */
@Service
public class ElderlyServiceImpl extends ServiceImpl<ElderlyMapper, Elderly> implements ElderlyService {
}
