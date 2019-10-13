package com.chb.decorator.upgrade;

import com.chb.adapter.loginadapder.ResultMsg;
import sun.reflect.generics.tree.IntSignature;

public abstract class IsigninForThirdService extends SiginService {
    /*** QQ 登录 * @param id * @return */
    public abstract ResultMsg loginForQQ(String id);

    /*** 微信登录 * @param id * @return */
    public abstract ResultMsg loginForWechat(String id);

    /*** 记住登录状态后自动登录 * @param token * @return */
    public abstract ResultMsg loginForToken(String token);

    /*** 手机号登录 * @param telphone * @param code * @return */
    public abstract ResultMsg loginForTelphone(String telphone, String code);

    /*** 注册后自动登录 * @param username * @param passport * @return
     */
    public abstract ResultMsg loginForRegist(String username, String passport);
}
