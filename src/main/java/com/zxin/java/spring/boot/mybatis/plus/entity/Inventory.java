package com.zxin.java.spring.boot.mybatis.plus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author zxin
 */
@Data
public class Inventory {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String code;

    private String name;

    private Long stock;

    private Long expend;

    //    @TableField(fill = FieldFill.UPDATE)
    @Version
    private Long version;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    @TableLogic
    private Integer deleted;

}
