package com.jianfan.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 患者

 * </p>
 *
 * @author lkz
 * @since 2020-07-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class JfSysPatient extends Model<JfSysPatient> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String cnName;

    private Integer age;

    private String mobile;

    private String inpatientno;

    private String openid;

    private String icon;

    private String source;

    private String isenabled;

    private String idcard;


    private String followupState;

    private String lastFlowupDate;

    private Integer flowupCycle;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
