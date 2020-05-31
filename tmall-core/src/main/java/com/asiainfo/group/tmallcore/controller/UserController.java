package com.asiainfo.group.tmallcore.controller;

import cn.hutool.core.bean.BeanUtil;
import com.asiainfo.group.tmallcore.model.User;
import com.asiainfo.group.tmallcore.service.UserService;
import com.asiainfo.group.tmallcore.util.WebResult;
import com.asiainfo.group.tmallcore.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author xulong3
 * @Title: file_name
 * @Package package_name
 * @Description: todo
 * @date 2020/5/31 13:32
 */

@RestController
@RequestMapping("/user")
@Api(tags = "用户控制器")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @ApiOperation(value = "新增用户")
    @ApiImplicitParams(value={
            @ApiImplicitParam(name="username",value="用户名",required=true,paramType="query",dataType="string"),
            @ApiImplicitParam(name="password",value="密码",required=true,paramType="query",dataType="string"),
            @ApiImplicitParam(name="birthday",value="生日",required=false,paramType="query",dataType="string"),
            @ApiImplicitParam(name="sex",value="性别",required=false,paramType="query",dataType="string"),
            @ApiImplicitParam(name="phone",value="手机号码",required=false,paramType="query",dataType="string"),
            @ApiImplicitParam(name="email",value="邮箱",required=false,paramType="query",dataType="string")
    })
    public WebResult<String> saveUser(@ApiIgnore UserVo userVo){
        WebResult<String> wr = new WebResult<>();

        User user = new User();
        BeanUtil.copyProperties(userVo,user);
        boolean isSave = userService.save(user);
        if(isSave){
            wr.setCode(200);
            wr.setMessage("新增用户成功！");
        }else{
            wr.setCode(500);
            wr.setMessage("新增用户失败！");
        }

        return wr;
    }



}
