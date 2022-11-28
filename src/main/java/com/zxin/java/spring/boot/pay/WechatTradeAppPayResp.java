package com.zxin.java.spring.boot.pay;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 文档：https://pay.weixin.qq.com/wiki/doc/apiv3/apis/chapter3_2_4.shtml
 * @author zxin
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)     // 忽略json内未知属性，默认会抛错
public class WechatTradeAppPayResp {

    /**
     * 预支付交易会话标识
     * 用于后续接口调用中使用，该值有效期为2小时
     * 示例值：wx201410272009395522657a690389285100
     */
    @JsonProperty("prepayid")
    private String prepayId;

    /**
     * 应用ID
     */
    @JsonProperty("appid")
    private String appId;

    /**
     * 商户号
     */
    @JsonProperty("partnerid")
    private String partnerId;

    /**
     * 订单详情扩展字符串
     */
    @JsonProperty("package")
    private String packageEx;

    /**
     * 随机字符串
     */
    @JsonProperty("noncestr")
    private String nonceStr;

    /**
     * 时间戳
     * <p>时间戳，标准北京时间，时区为东八区，自1970年1月1日 0点0分0秒以来的秒数。
     * 注意：部分系统取到的值为毫秒级，需要转换成秒(10位数字)。
     * 示例值：1412000000</p>
     */
    private String timestamp;

    /**
     * 签名
     */
    private String sign;

}
