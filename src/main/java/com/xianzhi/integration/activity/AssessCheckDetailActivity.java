package com.xianzhi.integration.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xianzhi.integration.R;
import com.xianzhi.integration.adapter.AssessCheckDetailAdapter;
import com.xianzhi.integration.base.BaseActivity;
import com.xianzhi.integration.bean.AssessCheckDetailBean;
import com.xianzhi.integration.bean.TimeAndAddressLisstBean;
import com.xianzhi.integration.model.base.BaseResponesBean;
import com.xianzhi.integration.model.base.ModelCompleteCallback;
import com.xianzhi.integration.model.base.ModelFactory;
import com.xianzhi.integration.tools.util.FastJsonUtil;
import com.xianzhi.integration.tools.util.StatusUtil;
import com.xianzhi.integration.view.MyAssessListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * @Administrator LiBo.
 * @Date 2017/7/27.
 * @Function 我的月度考核 查看详细
 */

public class AssessCheckDetailActivity extends BaseActivity implements ModelCompleteCallback<BaseResponesBean> {

    @BindView(R.id.tv_personal_userName)
    TextView tv_userName;
    @BindView(R.id.tv_personal_dete)
    TextView tv_month;
    @BindView(R.id.tv_personal_name)
    TextView tv_personal;
    @BindView(R.id.tv_personal_depart)
    TextView tv_depart;
    @BindView(R.id.tv_personal_job)
    TextView tv_jobName;
    @BindView(R.id.tv_personal_post)
    TextView tv_post;
    @BindView(R.id.iv_up_info)
    ImageView iv_up;
    @BindView(R.id.iv_down_info)
    ImageView iv_down;
    @BindView(R.id.lin_secondTitle)
    LinearLayout lin_secondTitle;
    @BindView(R.id.list_work)
    MyAssessListView list_work;
    @BindView(R.id.tv_month_problem)
    TextView tv_problem;
    @BindView(R.id.lin_content)
    LinearLayout lin_content;
    private String month;

    private AssessCheckDetailAdapter adapter;
    private List<AssessCheckDetailBean.ListBean> datas;

    @Override
    protected void onCreateView(Bundle saveInstanceState) {
        setContentView(R.layout.activity_assess_checkdetail);
    }

    @Override
    protected void initView() {
        tv_title.setText("我的月度考核");
        month = getIntent().getStringExtra("date");

        datas = new ArrayList<>();
        getDatas();
    }

    @Override
    protected void setListener() {
        iv_down.setOnClickListener(this);
        iv_up.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lin_back:
                finish();
                break;
            case R.id.iv_up_info:
                lin_secondTitle.setVisibility(View.GONE);
                break;
            case R.id.iv_down_info:
                lin_secondTitle.setVisibility(View.VISIBLE);
                break;
        }
    }

    private void getDatas() {
        progressDialog.show();
        model = ModelFactory.getModel(ModelFactory.ASSESSCHECKDETAIL, this, this);
        model.excuteParams(new AssessCheckDetailBean(month));
    }

    @Override
    public void onTaskPostExecute(int taskid, BaseResponesBean result) {
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        if (result == null) {
            return;
        }
        if (result.getStatus() != StatusUtil.STATUS_OK) {
            return;
        }
        if (result.getInterface_status() == StatusUtil.INTERFACE_OK) {
            lin_content.setVisibility(View.VISIBLE);
            AssessCheckDetailBean bean = FastJsonUtil.getObject(result.getDataholder().toString(), AssessCheckDetailBean.class);
            tv_problem.setText(bean.getProblem());
            tv_personal.setText(bean.getUser().getName());
            tv_userName.setText(bean.getUser().getName());
            tv_depart.setText(bean.getUser().getDept_name());
            tv_post.setText(bean.getUser().getPost_name());
            tv_jobName.setText(bean.getUser().getPosition_name());
            tv_month.setText(bean.getMonth());
//            LinkedHashSet<Integer> integers = new LinkedHashSet<>();
//            LinkedHashMap<Integer,ArrayList<AssessCheckDetailBean.ListBean>> map=new LinkedHashMap<>();
//            for (AssessCheckDetailBean.ListBean listBean : bean.getList()) {
//                int id = listBean.getPre_assessment_id();
//                if (id!=0) {
//                    integers.add(id);
//                }
//
//            }
//            for (Integer integer : integers) {
//                ArrayList<AssessCheckDetailBean.ListBean> listBeen = new ArrayList<>();
//                map.put(integer, listBeen);
//            }
//            for (int i = 0; i < bean.getList().size(); i++) {
//                int id = bean.getList().get(i).getPre_assessment_id();
//                Iterator<Map.Entry<Integer, ArrayList<AssessCheckDetailBean.ListBean>>> iterator = map.entrySet().iterator();
//                while (iterator.hasNext()) {
//                    Map.Entry<Integer, ArrayList<AssessCheckDetailBean.ListBean>> next = iterator.next();
//                    if (next.getKey() == id) {
//                        ArrayList<AssessCheckDetailBean.ListBean> value = next.getValue();
//                        value.add(bean.getList().get(i));
//                        break;
//                    }
//
//                }
//            }

            List<AssessCheckDetailBean.ListBean> datas = bean.getList();
            List<TimeAndAddressLisstBean> listDatas = new ArrayList();

            List<String> itemIds = new ArrayList<>();
            List<String> works = new ArrayList<>();
            for (int i = 0; i < datas.size(); i++) {
                itemIds.add(datas.get(i).getPre_assessment_id() + "");
                works.add(datas.get(i).getContent());
            }
            for (int i = 0; i < itemIds.size() - 1; i++) {
                for (int j = itemIds.size() - 1; j > i; j--) {
                    if (itemIds.get(j).equals(itemIds.get(i)) && !itemIds.get(j).equals("0")) {
                        itemIds.remove(j);
                        works.remove(j);
                    }
                }
            }

            for (int i = 0; i < itemIds.size(); i++) {
                List<TimeAndAddressLisstBean.TimeAndAddressBean> time = new ArrayList<>();
                for (int j = 0; j < datas.size(); j++) {
                    if((datas.get(j).getPre_assessment_id() + "").equals(itemIds.get(i)) && !itemIds.get(i).equals("0")){
                        String month = datas.get(j).getTime();
                        String place = datas.get(j).getPlace_type() + "-" + datas.get(j).getPlace();
                        String workDetail = datas.get(j).getContent1();
                        int dynamic = datas.get(j).getDynamic();
                        int normal_done = datas.get(j).getNormal_done();
                        int dynamic_done = datas.get(j).getDynamic_done();
                        int extra_done = datas.get(j).getExtra_done();
                        int normal = datas.get(j).getNormal();
                        TimeAndAddressLisstBean.TimeAndAddressBean datasBean = new TimeAndAddressLisstBean.TimeAndAddressBean(month, place, workDetail);
                        datasBean.setDynamic_done(dynamic_done);
                        datasBean.setExtra_done(extra_done);
                        datasBean.setNormal_done(normal_done);
                        datasBean.setDynamic(dynamic);
                        datasBean.setNormal(normal);
                        time.add(datasBean);
                    }
                }
                TimeAndAddressLisstBean listBean = new TimeAndAddressLisstBean(time, itemIds.get(i), i);
                listBean.setWork(works.get(i));
                listDatas.add(listBean);
            }

            adapter = new AssessCheckDetailAdapter(context, listDatas);
            list_work.setAdapter(adapter);;

        }
    }

}
