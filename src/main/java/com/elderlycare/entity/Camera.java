package com.elderlycare.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author YuanmingLiu
 * @Date 2023/7/15 12:49
 */
@ApiModel("摄像头")
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("camera")
public class Camera {

    @ApiModelProperty("摄像头id")
    @TableId
    private Long cameraId;

    @ApiModelProperty("摄像头名称")
    private String cameraName;

    @ApiModelProperty("流地址")
    private String streamAddress;

}
