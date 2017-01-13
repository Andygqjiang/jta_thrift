package com.jta.atomikos.dao;

import com.jta.atomikos.model.SysUser;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/12/15 0015.
 */
@Repository
public class SysUserDao {

    @Inject
    private SqlSessionTemplate sqlSessionTemplateB;

    protected SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplateB;
    }

    protected String generateStatement (String sql) {
        return this.getClass().getSimpleName() + "." + sql;
    }

    public void save(SysUser sysUser) {
        getSqlSessionTemplate().insert(generateStatement("insert"),sysUser);
    }
}
