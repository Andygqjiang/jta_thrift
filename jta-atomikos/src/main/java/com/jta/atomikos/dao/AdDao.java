package com.jta.atomikos.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import com.jta.atomikos.model.Ad;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/12/15 0015.
 */
@Repository
public class AdDao {

    @Inject
    protected SqlSessionTemplate sqlSessionTemplate;

    protected SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    protected String generateStatement (String sql) {
        return this.getClass().getSimpleName() + "." + sql;
    }

    public void save(Ad ad) {
        getSqlSessionTemplate().insert(generateStatement("insert"), ad);
    }
}
