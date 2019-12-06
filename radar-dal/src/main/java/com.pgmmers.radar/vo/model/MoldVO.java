package com.pgmmers.radar.vo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 机器学习模型配置，定义模型文件路径和参数
 * </p>
 *
 * @author guor
 * @date 2019/11/28
 */
public class MoldVO implements Serializable {
    /**
     * 自增ID，主键
     */
    private Long id;
    /**
     * 模型名称
     */
    private String name;
    /**
     * 模型文件路径
     */
    private String path;
    /**
     * tensorflow框架保存模型时设置的tag，非tensorflow模型此字段为空
     */
    private String tag;
    /**
     * 参数列表
     */
    private List<MoldParamVO> params;
    /**
     * 模型输出操作名称，predict_Y = tf.nn.softmax(softmax_before, name='predict')
     */
    private String operation;
    /**
     * 模型更新时间
     */
    private Date updateDate;

    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MoldParamVO> getParams() {
        return params;
    }

    public void setParams(List<MoldParamVO> params) {
        this.params = params;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}