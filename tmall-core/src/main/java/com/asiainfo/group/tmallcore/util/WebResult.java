package com.asiainfo.group.tmallcore.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author xulong3
 * @Title: file_name
 * @Package package_name
 * @Description: todo
 * @date 2020/5/31 13:34
 */
@Data
@ApiModel("通用响应对象")
public class WebResult<T> implements Serializable {
    private static final long serialVersionUID = 8738783689903454969L;

    @ApiModelProperty("状态码")
    private int code;

    @ApiModelProperty("响应信息")
    private String message;

    @ApiModelProperty("响应数据")
    private T data;


}
