package com.xh.wechat.company.handler.message;

import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.cp.api.WxCpService;
import me.chanjar.weixin.cp.bean.message.WxCpXmlMessage;
import me.chanjar.weixin.cp.bean.message.WxCpXmlOutMessage;

import java.util.Map;

/**
 * 处理自定义菜单消息
 *
 * @author: XieHua
 * @date: 2021-12-07 12:52
 */
public class MenuMessageHandler extends AbstractMessageHandler {
    @Override
    public WxCpXmlOutMessage handle(WxCpXmlMessage wxMessage, Map<String, Object> context, WxCpService wxCpService, WxSessionManager sessionManager) throws WxErrorException {
        return null;
    }
}
