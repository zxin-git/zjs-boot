package com.zxin.java.spring.boot.validate.bean;

import com.zxin.java.spring.boot.validate.constraint.AtLeastOne;
import lombok.Data;

/**
 * @author zxin
 */
@Data
@AtLeastOne({"id", "outId"})
public class AtLeastOneBean {
    
    private String id;
    
    private String outId;
    
}
