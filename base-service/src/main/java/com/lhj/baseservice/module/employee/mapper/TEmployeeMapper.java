package com.lhj.baseservice.module.employee.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lhj.basecore.domain.TEmployee;
import org.mapstruct.Mapper;

/**
 * <p>
 * 员工表 Mapper 接口
 * </p>
 *
 * @author 李洪健
 * @since 2021-03-15
 */
@Mapper
public interface TEmployeeMapper extends BaseMapper<TEmployee> {

}
