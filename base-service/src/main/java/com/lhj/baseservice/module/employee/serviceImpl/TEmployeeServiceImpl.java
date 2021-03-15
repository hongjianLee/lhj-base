package com.lhj.baseservice.module.employee.serviceImpl;

import com.lhj.basecore.domain.TEmployee;
import com.lhj.baseservice.module.employee.mapper.TEmployeeMapper;
import com.lhj.basecore.interfaces.ITEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.DubboService;
/**
 * <p>
 * 员工表 服务实现类
 * </p>
 *
 * @author 李洪健
 * @since 2021-03-15
 */
@DubboService(version = "${dubbo.provider.version}")
public class TEmployeeServiceImpl extends ServiceImpl<TEmployeeMapper, TEmployee> implements ITEmployeeService {

}
