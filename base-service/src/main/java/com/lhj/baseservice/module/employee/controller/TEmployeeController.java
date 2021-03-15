package com.lhj.baseservice.module.employee.controller;


import com.lhj.basecore.domain.TEmployee;
import com.lhj.basecore.interfaces.ITEmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 员工表 前端控制器
 * </p>
 *
 * @author 李洪健
 * @since 2021-03-15
 */
@Api("员工接口")
@RestController
@RequestMapping("/employee")
public class TEmployeeController {

    @Autowired
    private ITEmployeeService itEmployeeService;

    @ApiOperation("获取所有员工信息")
    @GetMapping("getList")
    public List getList() {
        List<TEmployee> list = itEmployeeService.list();
        return list;
    }
}
