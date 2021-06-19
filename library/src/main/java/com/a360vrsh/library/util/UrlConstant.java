package com.a360vrsh.library.util;

import rxhttp.wrapper.annotation.DefaultDomain;

/**
 * @author: wxj
 * @date: 2020/8/13
 * @description:
 */
public class UrlConstant {
    @DefaultDomain //设置为默认域名
    public static String BASE_URL = "http://jsvrworldservice.test.lzevr.com";
    public static String BASE_URL_XR = "http://api.test.jsxr.tech";

    //==================================九商XR接口开始==============================================
    //创建或查询kuntu项目
    public static String GET_PROJECT = BASE_URL_XR + "/kuntu/prj";
    //创建分组
    public static String CREATE_GROUP = BASE_URL_XR + "/kuntu/prj/";
    //一键修改状态
    public static String UPDATE_ALL = BASE_URL_XR + "/kuntu/status/";
    //修改项目状态
    public static String UPDATE_PROJECT_STATUS = BASE_URL_XR + "/kuntu/status/prj/";
    //修改分组状态
    public static String UPDATE_GROUP_STATUS = BASE_URL_XR + "/kuntu/status/group/";
    //根据设备修改状态
    public static String UPDATE_STATUS_BY_DEVICE = BASE_URL_XR + "/kuntu/status";
    //图片上传回调{id}/notify"
    public static String UPLOAD_CALLBACK = BASE_URL_XR + "/kuntu/pieces/";
    //我的拍摄列表
    public static String PROJECT_LIST = BASE_URL_XR + "/kuntu/prj";
    //我的拍摄详情
    public static String PROJECT_DETAIL = BASE_URL_XR + "/kuntu/prj/";
    //修改分组名称
    public static String UPDATE_GROUP_NAME = BASE_URL_XR + "/kuntu/group/";
    //删除分组
    public static String DELETE_GROUP = BASE_URL_XR + "/kuntu/group/";
    //店铺分类
    public static String STORE_CLASS = BASE_URL_XR + "/api/category";
    //修改店铺
    public static String EDIT_PROJECT = BASE_URL_XR + "/api/store/";

    //==================================九商XR接口结束==============================================

    //==================================全景世界接口开始==============================================

    //账号密码登录
    public static String LOGIN_BY_PWD = BASE_URL + "/api/login/pwd/photographer";
    //查询摄影师下已支付订单用户手机号
    public static String GET_CUSTOMER_PHONES = BASE_URL + "/api/order/get_user_phones";
    //信息检测
    public static String CHECK_INFO = BASE_URL + "/api/order/show_detect_info";
    //我的客户列表
    public static String MY_CUSTOMER = BASE_URL + "/api/project";
    //客户详情
    public static String CUSTOMER_DETAIL = BASE_URL + "/api/project/";
    //客户详情编辑
    public static String CUSTOMER_DETAIL_EDIT = BASE_URL + "/api/project/";
    //城市选择
    public static String AREA_ALL = BASE_URL + "/api/area_all";
    //我的资金
    public static String MY_WALLET = BASE_URL + "/api/wallet/info";
    //收支列表
    public static String MY_WEALTH_RECORD = BASE_URL + "/api/wealth_record";
    //收支列表总额
    public static String MY_WEALTH = BASE_URL + "/api/wealth_record/show_money";
    //提现账号
    public static String MY_WITH_DRAW_ACCOUNT = BASE_URL + "/api/withdrawal_account";
    //编辑添加提现账号
    public static String EDIT_WITH_DRAW_ACCOUNT = BASE_URL + "/api/withdrawal_account";


    //==================================全景世界接口结束==============================================


    //图片上传
    public static String UPLOAD = BASE_URL + "/api/cmm/upload";
    //批量图片上传
    public static String UPLOADS = BASE_URL + "/api/cmm/uploads";

    //获取验证码-注册、忘记密码 修改手机号使用
    public static String REGISTER_GET_CODE = BASE_URL + "/api/scenter/sms";
    //注册
    public static String REGISTER = BASE_URL + "/api/scenter/register";

    //获取验证码-登录使用
    public static String GET_CODE = BASE_URL + "/api/cas/sms";
    //验证码登录
    public static String LOGIN_BY_CODE = BASE_URL + "/api/cas/login/store/phone";

    //忘记密码
    public static String FORGET_PWD = BASE_URL + "/api/scenter/account/forgetPwd";


    //检查更新
    public static final String CHECK_VERSION = "http://appmg.hnyjkj.com/api/appDetail";


    public static final String BANNER1 = "https://360vrsh.oss-cn-qingdao.aliyuncs.com/store_app/sjm-app-banner1.png";
    public static final String BANNER2 = "https://360vrsh.oss-cn-qingdao.aliyuncs.com/store_app/sjm-app-banner2.png";
    //收钱码
    public static final String RECEIPT_CODE = "http://mb.360vrsh.com/home/pay_qrcode?store_id=";
}
