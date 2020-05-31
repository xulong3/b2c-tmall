package com.asiainfo.group.tmallcore.model;

/**
 * @author xulong3
 * @Title: file_name
 * @Package package_name
 * @Description: todo
 * @date 2020/5/31 13:26
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("tmall_user")
public class User implements Serializable {


    private static final long serialVersionUID = -4545218826687387350L;

    @TableId(type = IdType.ASSIGN_UUID)
    private String userId;

    private String username;

    private String password;

    private Date birthday;

    private Byte sex;

    private String phone;

    private String email;

    private Date createTime;

    private Date updateTime;

}