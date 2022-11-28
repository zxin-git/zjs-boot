package com.zxin.java.spring.boot.pay;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author zxin
 */
@RequestMapping("/pay")
@RestController
public class PayController {


//    @PostMapping("/action")
    @RequestMapping(path = "/action"
            , method = {RequestMethod.POST, RequestMethod.PUT}
//           , consumes = {"text/plain", "application/*"}
//           , produces = MediaType.APPLICATION_JSON_UTF8_VALUE
            , headers = "sign"
    )
    public WechatTradeAppPayResp action(@RequestBody TradePayReq req) throws IOException {
        System.out.println(req);
        String json = "{\n" +
                "  \"appId\": \"wxd930ea5d5a258f4f\",\n" +
                "  \"partnerId\": \"1900000109\",\n" +
                "  \"prepayId\": \"1101000000140415649af9fc314aa427\",\n" +
                "  \"packageValue\": \"Sign=WXPay\",\n" +
                "  \"nonceStr\": \"1101000000140429eb40476f8896f4c9\",\n" +
                "  \"timeStamp\": \"1398746574\",\n" +
                "  \"sign\": \"oR9d8PuhnIc+YZ8cBHFCwfgpaK9gd7vaRvkYD7rthRAZ/X+QBhcCYL21N7cHCTUxbQ+EAt6Uy+lwSN22f5YZvI45MLko8Pfso0jm46v5hqcVwrk6uddkGuT+Cdvu4WBqDzaDjnNa5UK3GfE1Wfl2gHxIIY5lLdUgWFts17D4WuolLLkiFZV+JSHMvH7eaLdT9N5GBovBwu5yYKUR7skR8Fu+LozcSqQixnlEZUfyE55feLOQTUYzLmR9pNtPbPsu6WVhbNHMS3Ss2+AehHvz+n64GDmXxbX++IOBvm2olHu3PsOUGRwhudhVf7UcGcunXt8cqNjKNqZLhLw4jq/xDg==\"\n" +
                "}";
        WechatTradeAppPayResp resp = new ObjectMapper().readValue(json, WechatTradeAppPayResp.class);
        return resp;
    }



}
