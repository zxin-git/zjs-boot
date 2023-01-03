package com.zxin.java.spring.boot.validate;

import lombok.Data;
import org.hibernate.validator.constraints.ScriptAssert;

import java.util.Date;

/**
 * @author zxin
 */
@Data
@ScriptAssert(lang = "javascript", script = "_this.startDate != null && _this.endDate != null && _this.startDate.before(_this.endDate)")
//@ScriptAssert(lang = "javascript", script = "_this.startDate.before(_this.endDate)")
//@ScriptAssert(lang = "jexl", script = "_.startDate > _.endDate", alias = "_")
public class ScriptAssertBean {
    
    private Date startDate;
    
    private Date endDate;
    
}
