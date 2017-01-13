package com.jta.atomikos.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.HashMap;
import java.util.Map;

/**
 * 公共对象
 * 所有model都要继承此类
 * @author Andy
 */
public class BaseModel implements java.io.Serializable {

    private static final long serialVersionUID = 8484697384425520946L;

    private Long eid;

    private String createTime;

    private String updateTime;

    @JSONField(serialize = false)
    private Integer erpBtype;

    /**
     * 返回值
     */
    @JSONField(serialize = false)
    private Map<String, Object> returnParam;

    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getErpBtype() {
        return erpBtype;
    }

    public void setErpBtype(Integer erpBtype) {
        this.erpBtype = erpBtype;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Map<String, Object> getReturnParam() {
        return returnParam;
    }

    public void setReturnParam(Map<String, Object> returnParam) {
        this.returnParam = returnParam;
    }

    public void setParam(String key, Object value) {
        if (returnParam == null) returnParam = new HashMap<>();
        returnParam.put(key, value);
    }
}
