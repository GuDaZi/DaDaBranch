package com.xianzhi.integration.tools.util;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;

import com.xianzhi.integration.http.download.DownloadAsyncTaskProgressDialog;
import com.xianzhi.integration.http.download.DownloadCallbackListener;

import java.io.File;

/**
 * Created by 李博 on 2016/12/5.
 */

public class DownLoadFileTool {

    private static Context mContext;
    /**
     * 下载文件
     * @param url 接口
     * @param fileName 网路文件的名字
     * @param activity
     */
    public static void downLoad(String id, String url, String fileName, final Activity activity, final Context context){
        mContext = context;
        ProgressDialog dialog = new ProgressDialog(context);
        dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        dialog.setCancelable(false);
        DownloadAsyncTaskProgressDialog down = new DownloadAsyncTaskProgressDialog(dialog);
        down.setdownloadCallbackListener(new DownloadCallbackListener() {
            @Override
            public void onComplete(File downloadFile) {
                if(downloadFile != null){
                    final Intent intent = FileUtil.openFile(downloadFile.getAbsolutePath());
                    activity.startActivity(intent);
                }
            }
        });
        down.execute(new String[] {url, isExist(ImageFileCache.getSDPath() + "/数字沈局/") + id + fileName});
    }

    /**
     * 判断文件夹是否存在,如果不存在则创建文件夹
     * @param path 路径
     * @return
     */
    public static String isExist(String path) {
        File file = new File(path);
        if (!file.exists()) {
            file.mkdir();
        }
        return path;
    }

}
