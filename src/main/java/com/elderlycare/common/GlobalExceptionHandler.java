package com.elderlycare.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author YuanmingLiu
 * @Date 2023/5/14 18:47
 */
@ControllerAdvice(annotations = {RestController.class, Controller.class})
@ResponseBody
@Slf4j
public class GlobalExceptionHandler {

    /**
     * @description: 处理异常
     * @author: YuanmingLiu
     * @date: 2023/5/14 18:47
     * @param: [ex]
     * @return: com.lqyrmk.emovie.common.ResponseResult<java.lang.String>
     **/
    @ExceptionHandler(ElderlyException.class)
    public ResponseResult<String> exceptionHandler(ElderlyException ex) {
        log.error(ex.getMessage());
        return ResponseResult.error(ex.getMessage());
    }

}
