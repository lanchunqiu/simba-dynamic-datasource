
package com.simba.commons.dynamic.datasource.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.simba.commons.dynamic.datasource.annotation.DataSource;
import com.simba.commons.dynamic.datasource.dao.SysUserDao;
import com.simba.commons.dynamic.datasource.domain.SysUserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试多数据源
 *
 * @author lancq
 */
@Slf4j
@Service
//@DataSource("slave1")
public class DynamicDataSourceTestService {
    @Resource
    private SysUserDao sysUserDao;

    @Transactional
    public void updateUser(Long id){
        SysUserEntity user = new SysUserEntity();
        user.setUserId(id);
        user.setMobile("13500000000");
        sysUserDao.updateById(user);
    }

    @Transactional
    @DataSource("slave1")
    public void updateUserBySlave1(Long id){
        SysUserEntity user = new SysUserEntity();
        user.setUserId(id);
        user.setMobile("13500000001");
        sysUserDao.updateById(user);
    }

    @DataSource("slave2")
    @Transactional
    public void updateUserBySlave2(Long id){
        SysUserEntity user = new SysUserEntity();
        user.setUserId(id);
        user.setMobile("13500000002");
        sysUserDao.updateById(user);

        List list = sysUserDao.selectList(new QueryWrapper());
        log.info("list={}", list);
        //测试事物
        //int i = 1/0;
    }
}