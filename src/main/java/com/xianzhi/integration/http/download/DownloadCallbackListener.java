package com.xianzhi.integration.http.download;

import java.io.File;

public interface DownloadCallbackListener {
	public void onComplete(File downloadFile);
}
