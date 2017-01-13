package com.jta.atomikos.test;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.expr.SQLDefaultExpr;
import com.alibaba.druid.sql.ast.statement.SQLCreateViewStatement;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlCharExpr;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlExportParameterVisitor;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlOutputVisitor;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlParameterizedOutputVisitor;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlSchemaStatVisitor;
import com.alibaba.druid.util.JdbcConstants;
import com.jta.atomikos.service.SysUserManager;
import javacommon.util.SpringContextUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2016/12/15 0015.
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring/spring-*.xml"})*/
public class TestMain {

    @Test
    public void testSave() {
        try {
            SysUserManager sysUserManager = SpringContextUtil.getBean("sysUserManager");
            sysUserManager.save();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSql(){
        try {
            String sql = "SELECT a.ID, a.NAME, b.AGE FROM USER a, Dept b WHERE a.id=b.aid a         nd ID = 5";
            String dbType = JdbcConstants.MYSQL;
            List<SQLStatement> stmtList = SQLUtils.parseStatements(sql, dbType);

            //解析出的独立语句的个数
            System.out.println("size is:" + stmtList.size());
            for (SQLStatement stmt : stmtList) {

                MySqlSchemaStatVisitor visitor = new MySqlSchemaStatVisitor();
                stmt.accept(visitor);

                //获取表名称
                System.out.println("Tables : " + visitor.getTables());
                //获取操作方法名称,依赖于表名称
                System.out.println("Manipulation : " + visitor.getTables());
                //获取字段名称
                System.out.println("fields : " + visitor.getColumns());

                MySqlExportParameterVisitor parameterVisitor = new MySqlExportParameterVisitor();
                stmt.accept(parameterVisitor);
                System.out.println(parameterVisitor.getParameters());

                MySqlParameterizedOutputVisitor mySqlParameterizedOutputVisitor = new MySqlExportParameterVisitor();
                stmt.accept(mySqlParameterizedOutputVisitor);
                mySqlParameterizedOutputVisitor.endVisit(new SQLCreateViewStatement.Column());
                System.out.println(mySqlParameterizedOutputVisitor.getParameters());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testLong(){
        long l = 8;

    }

}
