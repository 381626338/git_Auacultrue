package com.aquacultrue.Application;

import java.util.LinkedList;
import java.util.List;
import android.app.Activity;
import android.app.Application;
/**
 * 全局控制类Application,app启动时开启，直至app关闭停止
 * @author YZX.2015.5.18
 *
 */
public class APP extends Application {

	private static APP instance = null;
	// 用来存放Activity的list
	private List activityList = new LinkedList();

	public void onCreate() {
		super.onCreate();
		instance = this;

	}

	
	// 单例模式中获取唯一的ExitApplication实例
	public static APP getInstance() {
		if (null == instance) {
			instance = new APP();
		}
		return instance;

	}
	// 添加Activity到容器中
	public void addActivity(Activity activity) {
		activityList.add(activity);
	}

	// 遍历所有Activity并finish
	public void exit() {
		for (Object activity : activityList) {
			((Activity) activity).finish();
		}
		System.exit(0);

	}
}
