package com.zxin.java.spring.boot.pay;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.io.IOException;

/**
 * @author zxin
 */
@RequestMapping("/validate")
@RestController
public class ValidateController {

    @PostMapping("/action")
    public WechatTradeAppPayResp action(@Valid @RequestBody TradePayReq req) throws IOException {
        return null;
    }

}
