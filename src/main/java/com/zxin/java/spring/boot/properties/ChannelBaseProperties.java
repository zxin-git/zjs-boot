package com.zxin.java.spring.boot.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zxin
 */
@Data
@Component
@ConfigurationProperties(prefix = "hermes.channel.provider.base")
public class ChannelBaseProperties {
    
    /**
     * 基础域名及路径前缀
     * <p>用于回调</p>
     */
    private String domain = "https://api.axzo.cn/hermes";
    
}
