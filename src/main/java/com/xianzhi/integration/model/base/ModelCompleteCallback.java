package com.xianzhi.integration.model.base;

public interface ModelCompleteCallback<T> {
	void onTaskPostExecute(int taskid, T result);
}
