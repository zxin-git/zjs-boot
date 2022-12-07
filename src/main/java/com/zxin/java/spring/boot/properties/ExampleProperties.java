package com.zxin.java.spring.boot.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zxin
 */
@Data
@Component
@ConfigurationProperties(prefix = "hermes.channel.provider.cucc")
public class ExampleProperties {
    
    /**
     * 回调地址
     *
     * <p>默认值不可用，只能配置文件内的属性互相引用</p>
     */
    private String callbackUrl = "${hermes.channel.provider.base.domain}/webApaaaa";
    
}
