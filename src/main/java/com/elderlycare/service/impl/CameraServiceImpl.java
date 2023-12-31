package com.elderlycare.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.elderlycare.entity.Camera;
import com.elderlycare.mapper.CameraMapper;
import com.elderlycare.service.CameraService;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author YuanmingLiu
 * @Date 2023/7/15 13:06
 */
@Service
public class CameraServiceImpl extends ServiceImpl<CameraMapper, Camera> implements CameraService {
}
