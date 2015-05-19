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
 * 自定义标题栏
 * @author YZX.2015.5.18
 */
public class TitleBar extends RelativeLayout{
	
	private Context mContext;
	private LayoutInflater mlayout;//布局填充器
	private RelativeLayout mtitleLayout;//总体布局
	private Activity mActivity;
	private RelativeLayout titlebar_layout;
	//左边
	public ImageButton leftTitleLayout;
	//中间
	private LinearLayout centerLayout;
	private TextView centerTitleTv;
	//右边
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
		//左边
		leftTitleLayout = (ImageButton) findViewById(R.id.left_titlebar_layout);
		//中间
		centerLayout = (LinearLayout) findViewById(R.id.center_titlebar_layout);
		centerTitleTv = (TextView) findViewById(R.id.center_titlebar_tv);
		//右边
		rightTitleLayout = (ImageButton) findViewById(R.id.right_titlebar_layout);
		secondRightTitleLayout = (ImageButton) findViewById(R.id.second_right_titlebar_layout);
		thridRightTitleLayout = (ImageButton) findViewById(R.id.thrid_right_titlebar_layout);		
	}
	
	/**
	 * @Title: changeTitleBarBackground 
	 * @Description: 改变背景图片
	 * @param @param resId    
	 * @return void    返回类型 
	 * @throws
	 */
	public void changeTitleBarBackground(int resId){
		titlebar_layout.setBackgroundResource(resId);	
	}
	
	/**
	 * 设置标题
	 * @param title
	 * @param activity
	 */
	public void setTitle(String title, Activity activity) {
		this.mActivity = activity;
		centerTitleTv.setText(title);
	}
	
	/**
	 * 增加titleBar左边
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
	 * 增加titleBar左边
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
	 * 增加titleBar最右边
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
	 * 隐藏titleBar最右边
	 * @param activity
	 */
	public void removeRightBtn(Activity activity){
		this.mActivity = activity;
		rightTitleLayout.setVisibility(View.INVISIBLE);
	}
	
	/**
	 * 增加titleBar右边第二个按钮
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
	 * 增加titleBar右边第三个按钮
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
