package com.simba.commons.dynamic.datasource.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.simba.commons.dynamic.datasource.domain.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 系统用户
 * 
 * @author lancq
 * @email ${email}
 */
@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {
}
