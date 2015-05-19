package com.aquacultrue.Application;

import java.util.LinkedList;
import java.util.List;
import android.app.Activity;
import android.app.Application;
/**
 * ȫ�ֿ�����Application,app����ʱ������ֱ��app�ر�ֹͣ
 * @author YZX.2015.5.18
 *
 */
public class APP extends Application {

	private static APP instance = null;
	// �������Activity��list
	private List activityList = new LinkedList();

	public void onCreate() {
		super.onCreate();
		instance = this;

	}

	
	// ����ģʽ�л�ȡΨһ��ExitApplicationʵ��
	public static APP getInstance() {
		if (null == instance) {
			instance = new APP();
		}
		return instance;

	}
	// ���Activity��������
	public void addActivity(Activity activity) {
		activityList.add(activity);
	}

	// ��������Activity��finish
	public void exit() {
		for (Object activity : activityList) {
			((Activity) activity).finish();
		}
		System.exit(0);

	}
}
