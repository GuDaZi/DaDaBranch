package com.xianzhi.integration.model.base;

import android.content.Context;

import com.xianzhi.integration.presenter.AddSecurityPresenter;
import com.xianzhi.integration.presenter.CpcDetailPresenter;
import com.xianzhi.integration.presenter.CadrePreCheckPresenter;
import com.xianzhi.integration.presenter.CadreSelfWorkPresenter;
import com.xianzhi.integration.presenter.CpcDynamicPresenter;
import com.xianzhi.integration.presenter.CpcDynamicRePresenter;
import com.xianzhi.integration.presenter.CpcDynamicUpPresenter;
import com.xianzhi.integration.presenter.CpcMultiAddPresenter;
import com.xianzhi.integration.presenter.CpcMultiRePresenter;
import com.xianzhi.integration.presenter.CpcMultiUpPresenter;
import com.xianzhi.integration.presenter.CpcSetAddPresenter;
import com.xianzhi.integration.presenter.CpcSetPresenter;
import com.xianzhi.integration.presenter.CpcMultiPresenter;
import com.xianzhi.integration.presenter.CpcFilterPresenter;
import com.xianzhi.integration.presenter.CpcSetSubmitPresenter;
import com.xianzhi.integration.presenter.CswSetRefreshPresenter;
import com.xianzhi.integration.presenter.SecEditAddPresenter;
import com.xianzhi.integration.presenter.SecEditDelPresenter;
import com.xianzhi.integration.presenter.SecEditRePresenter;
import com.xianzhi.integration.presenter.SecDetailPresenter;
import com.xianzhi.integration.presenter.SecEditPresenter;
import com.xianzhi.integration.presenter.SecPresenter;
import com.xianzhi.integration.presenter.SecRenamePresenter;
import com.xianzhi.integration.presenter.SecTreePresenter;
import com.xianzhi.integration.presenter.CswFilterPresenter;
import com.xianzhi.integration.presenter.CswSetPresenter;
import com.xianzhi.integration.presenter.CswSetUpPresenter;

import java.util.List;

/**
 * 一体化设置模块
 */

public class SettingsModelFactory {

    //安全风险控制表
    public static final int SEC = 100;
    public static final int SEC_DETAIL = 101;
    public static final int SEC_RENAME = 102;
    public static final int SEC_TREE = 103;
    public static final int SEC_EDIT = 104;
    public static final int SEC_ADD = 105;
    public static final int SEC_EDIT_RENAME = 106;
    public static final int SEC_EDIT_DEL = 107;
    public static final int SEC_EDIT_ADD = 108;

    //月度预考核表
    public static final int CPC = 110;
    public static final int CPC_DETAIL = 111;
    public static final int CPC_DETAIL_REFRESH = 112;
    public static final int CPC_SET = 113;
    public static final int CPC_SET_UP = 114;
    public static final int CPC_SET_ADD_DYNAMIC = 1141;
    public static final int CPC_REUSE = 115;
    public static final int CPC_MULTISET = 116;
    public static final int CPC_MULTI_RE = 1161;
    public static final int CPC_MULTI_UP = 1162;
    public static final int CPC_MULTI_ADD = 1163;
    public static final int CPC_DYNAMIC = 117;
    public static final int CPC_DYNAMIC_RE = 1171;
    public static final int CPC_DYNAMIC_UP = 1172;
    public static final int CPC_FILTER = 1105;

    //本职工作设置表
    public static final int CSW = 120;
    public static final int CSW_SET = 121;
    public static final int CSW_SET_MONTH = 122;
    public static final int CSW_SET_UPDATE = 123;
    public static final int CSW_FILTER = 124;

    public static Model getModel(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> result) {
        Model model = null;
        switch (model_id) {
            case SEC:
                model = new SecPresenter(model_id, context, result);
                break;
            case CPC:
                model = new CadrePreCheckPresenter(model_id, context, result);
                break;
            case CSW:
                model = new CadreSelfWorkPresenter(model_id, context, result);
                break;
            case CPC_MULTISET:
                model = new CpcMultiPresenter(model_id, context, result);
                break;
            case CPC_DYNAMIC:
                model = new CpcDynamicPresenter(model_id, context, result);
                break;
        }
        return model;
    }

    public static Model getModelParams(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> result, String year, String id) {
        Model model = null;
        switch (model_id) {
            case SEC_DETAIL:
                model = new SecDetailPresenter(model_id, context, result, year, id);
                break;
        }
        return model;
    }

    public static Model getModelList(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> result, List params) {
        Model model = null;
        switch (model_id) {
            //1.1添加安全标准表格
            case SEC_ADD:
                model = new AddSecurityPresenter(model_id, context, result, params);
                break;
            //1.2安全表格编辑(改名)
            case SEC_RENAME:
                model = new SecRenamePresenter(model_id, context, result, params);
                break;
            //1.3.1获取TreeView
            case SEC_TREE:
                model = new SecTreePresenter(model_id, context, result, params);
                break;
            //1.3.2获取TreeView对应的界面数据
            case SEC_EDIT:
                model = new SecEditPresenter(model_id, context, result, params);
                break;
            //表格项目改名
            case SEC_EDIT_RENAME:
                model = new SecEditRePresenter(model_id, context, result, params);
                break;
            //表格项目删除
            case SEC_EDIT_DEL:
                model = new SecEditDelPresenter(model_id, context, result, params);
                break;
            //表格项目添加
            case SEC_EDIT_ADD:
                model = new SecEditAddPresenter(model_id, context, result, params);
                break;

            //2.1 月度预考核筛选
            case CPC_FILTER:
                model = new CpcFilterPresenter(model_id, context, result, params);
                break;
            //2.1.1干部月度预考核查看
            case CPC_DETAIL:
                model = new CpcDetailPresenter(model_id, context, result, params);
                break;
            //2.1.1按月份刷新界面,服务端暂时没有更新
            case CPC_DETAIL_REFRESH:
                model = new CpcDetailPresenter(model_id, context, result, params);
                break;
            //预考核设置
            case CPC_SET:
                model = new CpcSetPresenter(model_id, context, result, params);
                break;
            //预考核设置更新
            case CPC_SET_UP:
                model = new CpcSetSubmitPresenter(model_id, context, result, params);
                break;
            //预考核设置增加动态任务
            case CPC_SET_ADD_DYNAMIC:
                model = new CpcSetAddPresenter(model_id, context, result, params);
                break;

            //批量设置更新页面
            case CPC_MULTI_RE:
                model = new CpcMultiRePresenter(model_id, context, result, params);
                break;
            //批量设置上传表单
            case CPC_MULTI_UP:
                model = new CpcMultiUpPresenter(model_id, context, result, params);
                break;
            //批量设置界面,添加动态任务
            case CPC_MULTI_ADD:
                model = new CpcMultiAddPresenter(model_id, context, result, params);
                break;
            //刷新增加动态任务界面
            case CPC_DYNAMIC_RE:
                model = new CpcDynamicRePresenter(model_id, context, result, params);
                break;
            //刷新增加动态任务界面
            case CPC_DYNAMIC_UP:
                model = new CpcDynamicUpPresenter(model_id, context, result, params);
                break;
            //复用预考核信息
            case CPC_REUSE:
                model = new CpcDynamicUpPresenter(model_id, context, result, params);
                break;


            //3.1设置本职工作界面的请求
            case CSW_SET:
                model = new CswSetPresenter(model_id, context, result, params);
                break;
            //3.1.1根据月份刷新界面
            case CSW_SET_MONTH:
                model = new CswSetRefreshPresenter(model_id, context, result, params);
                break;
            //3.1.1保存本职工作信息
            case CSW_SET_UPDATE:
                model = new CswSetUpPresenter(model_id, context, result, params);
                break;
            //3.2 本职工作筛选
            case CSW_FILTER:
                model = new CswFilterPresenter(model_id, context, result, params);
                break;
        }
        return model;
    }

}
