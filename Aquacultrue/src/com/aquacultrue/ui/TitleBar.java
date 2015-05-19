package com.aquacultrue.ui;

import com.aquacultrue.app.R;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * �Զ��������
 * @author YZX.2015.5.18
 */
public class TitleBar extends RelativeLayout{
	
	private Context mContext;
	private LayoutInflater mlayout;//���������
	private RelativeLayout mtitleLayout;//���岼��
	private Activity mActivity;
	private RelativeLayout titlebar_layout;
	//���
	public ImageButton leftTitleLayout;
	//�м�
	private LinearLayout centerLayout;
	private TextView centerTitleTv;
	//�ұ�
	public ImageButton rightTitleLayout;
	public ImageButton secondRightTitleLayout;
	public ImageButton thridRightTitleLayout;
	
	public TitleBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.mContext = context;
		this.mlayout = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		this.mtitleLayout = (RelativeLayout) mlayout.inflate(R.layout.titlebar_layout, null);
		addView(mtitleLayout);
		titlebar_layout = (RelativeLayout) findViewById(R.id.titlebar_layout);	
		//���
		leftTitleLayout = (ImageButton) findViewById(R.id.left_titlebar_layout);
		//�м�
		centerLayout = (LinearLayout) findViewById(R.id.center_titlebar_layout);
		centerTitleTv = (TextView) findViewById(R.id.center_titlebar_tv);
		//�ұ�
		rightTitleLayout = (ImageButton) findViewById(R.id.right_titlebar_layout);
		secondRightTitleLayout = (ImageButton) findViewById(R.id.second_right_titlebar_layout);
		thridRightTitleLayout = (ImageButton) findViewById(R.id.thrid_right_titlebar_layout);		
	}
	
	/**
	 * @Title: changeTitleBarBackground 
	 * @Description: �ı䱳��ͼƬ
	 * @param @param resId    
	 * @return void    �������� 
	 * @throws
	 */
	public void changeTitleBarBackground(int resId){
		titlebar_layout.setBackgroundResource(resId);	
	}
	
	/**
	 * ���ñ���
	 * @param title
	 * @param activity
	 */
	public void setTitle(String title, Activity activity) {
		this.mActivity = activity;
		centerTitleTv.setText(title);
	}
	
	/**
	 * ����titleBar���
	 * @param activity
	 */
	public void addBackTitleBtn(Activity activity) {
		this.mActivity = activity;
		leftTitleLayout.setVisibility(View.VISIBLE);
		leftTitleLayout.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {

			}
		});
	}
	
	/**
	 * ����titleBar���
	 * @param activity
	 * @param clickListener
	 * @param rightTitleIcon
	 */
	public void addLeftTitleBtn(Activity activity, OnClickListener clickListener) {
		this.mActivity = activity;
		leftTitleLayout.setVisibility(View.VISIBLE);
		leftTitleLayout.setOnClickListener(clickListener);
	}
	
	/**
	 * ����titleBar���ұ�
	 * @param activity
	 * @param clickListener
	 * @param rightTitleIcon
	 */
	public void addRightTitleBtn(Activity activity,
			OnClickListener clickListener, int rightTitleIcon) {
		this.mActivity = activity;
		rightTitleLayout.setVisibility(View.VISIBLE);
		if (null != clickListener) {
			rightTitleLayout.setBackgroundResource(rightTitleIcon);
			rightTitleLayout.setOnClickListener(clickListener);
		}
	}
	
	/**
	 * ����titleBar���ұ�
	 * @param activity
	 */
	public void removeRightBtn(Activity activity){
		this.mActivity = activity;
		rightTitleLayout.setVisibility(View.INVISIBLE);
	}
	
	/**
	 * ����titleBar�ұߵڶ�����ť
	 * @param activity
	 * @param clickListener
	 * @param rightTitleIcon
	 */
	public void addSecondRightTitleBtn(Activity activity,
			OnClickListener clickListener, int rightTitleIcon) {
		this.mActivity = activity;
		secondRightTitleLayout.setVisibility(View.VISIBLE);
		if (null != clickListener) {
			secondRightTitleLayout.setBackgroundResource(rightTitleIcon);
			secondRightTitleLayout.setOnClickListener(clickListener);
		}
	}
	/**
	 * ����titleBar�ұߵ�������ť
	 * @param activity
	 * @param clickListener
	 * @param rightTitleIcon
	 */
	public void addThridRightTitleBtn(Activity activity,
			OnClickListener clickListener, int rightTitleIcon) {
		this.mActivity = activity;
		thridRightTitleLayout.setVisibility(View.VISIBLE);
		if (null != clickListener) {
			thridRightTitleLayout.setBackgroundResource(rightTitleIcon);
			thridRightTitleLayout.setOnClickListener(clickListener);
		}
	}

}
