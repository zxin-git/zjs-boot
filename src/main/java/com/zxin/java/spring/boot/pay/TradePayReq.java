package com.zxin.java.spring.boot.pay;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

/**
 * https://pay.weixin.qq.com/wiki/doc/apiv3_partner/apis/chapter4_2_1.shtml
 * @author zxin
 */
@Data
public class TradePayReq {

    /**
     * 商户订单号
     */
    @NotNull
    @Size(min = 8, max = 16)
    private String outTradeNo;

    /**
     * 订单金额
     * 单位 元，精确到小数点后两位
     */
    @NotNull
    @Min(0)
    private BigDecimal totalAmount;

    /**
     * 订单标题
     */
    @NotNull
    @Email
    private String subject;

}