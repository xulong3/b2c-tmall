package com.asiainfo.group.tmallcore.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author xulong3
 * @Title: file_name
 * @Package package_name
 * @Description: todo
 * @date 2020/5/31 13:52
 */
@Data
public class UserVo implements Serializable {
    private static final long serialVersionUID = -983330638759966944L;

    private String userId;

    private String username;

    private String password;

    private String birthday;

    private String sex;

    private String phone;

    private String email;

    private String createTime;

    private String updateTime;

}
