package com.xianzhi.integration.model.base;

import android.content.Context;

import com.xianzhi.integration.model.AddressTypeModel;
import com.xianzhi.integration.model.ApproveDeaprtModel;
import com.xianzhi.integration.model.ApproveModel;
import com.xianzhi.integration.model.ApproveOpinionModel;
import com.xianzhi.integration.model.AssessCheckDetailModel;
import com.xianzhi.integration.model.AssessCollectModel;
import com.xianzhi.integration.model.AssessScoreInfoModel;
import com.xianzhi.integration.model.AssessScoreModel;
import com.xianzhi.integration.model.CadreAssessModel;
import com.xianzhi.integration.model.CadreTableModel;
import com.xianzhi.integration.model.EnterWorkModel;
import com.xianzhi.integration.model.EnterWorkSubmitModel;
import com.xianzhi.integration.model.LeaderApproveModel;
import com.xianzhi.integration.model.MyAssessEnterWorkModel;
import com.xianzhi.integration.model.MyAssessInfoModel;
import com.xianzhi.integration.model.MyAssessModel;
import com.xianzhi.integration.model.QuantizationDetailModel;
import com.xianzhi.integration.model.QuantizationInfoModel;
import com.xianzhi.integration.model.QuartizationModel;
import com.xianzhi.integration.model.RejectApproveModel;
import com.xianzhi.integration.model.RiskControllerModel;
import com.xianzhi.integration.model.SelfEvaluateEditModel;
import com.xianzhi.integration.model.SelfEvaluateModel;
import com.xianzhi.integration.model.SelfEvaluateSaveModel;
import com.xianzhi.integration.model.TableDialogModel;
import com.xianzhi.integration.model.TableUpdateModel;
import com.xianzhi.integration.model.WarningListModel;


/**
 * Created by 李博 on 2016/12/4.
 */

public class ModelFactory {

    public static final int MYASSESS = 0;
    public static final int MYASSESSINFO = 1;
    public static final int ENTERWORK = 2;
    public static final int ADDRESSTYPE = 3;
    public static final int ENTERWORKSUBMIT = 4;
    public static final int SELFEVALUATE = 5;
    public static final int SELFEVALUATEEDIT = 6;
    public static final int SELFEVALUATESAVE = 7;
    public static final int CADRELIST = 8;
    public static final int MYENTERWORKSUBMIT = 9;
    public static final int CADRETABLE = 10;
    public static final int EARSON = 11;
    public static final int APPROVE = 12;
    public static final int APPROVEDEPART = 13;
    public static final int APPROVEOPINION = 14;
    public static final int LEADERAPPROVE = 15;
    public static final int UPDATETABLE = 16;
    public static final int ASSESSCHECKDETAIL = 17;
    public static final int QUANTIZATIONLIST = 18;
    public static final int QUANTIZATIONINFO = 19;
    public static final int QUANZATIONDETAIL = 20;
    public static final int WARNING = 21;
    public static final int ASSESSCOLLECT = 22;
    public static final int REJECTAPPROVE = 23;
    public static final int RISKCONTROLLER = 24;
    public static final int ASSESSSCORE = 25;
    public static final int ASSESSSCOREINFO = 26;


    public static Model getModel(int model_id, Context context, ModelCompleteCallback<BaseResponesBean> result){
        Model model = null;
        switch (model_id) {
            case MYASSESS:
                model = new MyAssessModel(model_id, context, result);
                break;
            case MYASSESSINFO:
                model = new MyAssessInfoModel(model_id, context, result);
                break;
            case ENTERWORK:
                model = new EnterWorkModel(model_id, context, result);
                break;
            case ADDRESSTYPE:
                model = new AddressTypeModel(model_id, context, result);
                break;
            case ENTERWORKSUBMIT:
                model = new EnterWorkSubmitModel(model_id, context, result);
                break;
            case SELFEVALUATE:
                model = new SelfEvaluateModel(model_id, context, result);
                break;
            case SELFEVALUATEEDIT:
                model = new SelfEvaluateEditModel(model_id, context, result);
                break;
            case SELFEVALUATESAVE:
                model = new SelfEvaluateSaveModel(model_id, context, result);
                break;
            case CADRELIST:
                model = new CadreAssessModel(model_id, context, result);
                break;
            case MYENTERWORKSUBMIT:
                model = new MyAssessEnterWorkModel(model_id, context, result);
                break;
            case CADRETABLE:
                model = new CadreTableModel(model_id, context, result);
                break;
            case EARSON:
                model = new TableDialogModel(model_id, context, result);
                break;
            case APPROVE:
                model = new ApproveModel(model_id, context, result);
                break;
            case APPROVEDEPART:
                model = new ApproveDeaprtModel(model_id, context, result);
                break;
            case APPROVEOPINION:
                model = new ApproveOpinionModel(model_id, context, result);
                break;
            case LEADERAPPROVE:
                model = new LeaderApproveModel(model_id, context, result);
                break;
            case UPDATETABLE:
                model = new TableUpdateModel(model_id, context, result);
                break;
            case ASSESSCHECKDETAIL:
                model = new AssessCheckDetailModel(model_id, context, result);
                break;
            case QUANTIZATIONLIST:
                model = new QuartizationModel(model_id, context, result);
                break;
            case QUANTIZATIONINFO:
                model = new QuantizationInfoModel(model_id, context, result);
                break;
            case QUANZATIONDETAIL:
                model = new QuantizationDetailModel(model_id, context, result);
                break;
            case WARNING:
                model = new WarningListModel(model_id, context, result);
                break;
            case ASSESSCOLLECT:
                model = new AssessCollectModel(model_id, context, result);
                break;
            case REJECTAPPROVE:
                model = new RejectApproveModel(model_id, context, result);
                break;
            case RISKCONTROLLER:
                model = new RiskControllerModel(model_id, context, result);
                break;
            case ASSESSSCORE:
                model = new AssessScoreModel(model_id, context, result);
                break;
            case ASSESSSCOREINFO:
                model = new AssessScoreInfoModel(model_id, context, result);
                break;

        }
        return model;
    }
}
