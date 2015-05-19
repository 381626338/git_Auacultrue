package com.aquacultrue.activity;

import com.aquacultrue.app.R;
import com.aquacultrue.base.BaseActivity;
import com.aquacultrue.ui.SlidingMenu;
import com.aquacultrue.ui.TitleBar;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ExpandableListView;
/**
 * 首页
 * @author YZX.2015.5.18
 *
 */
public class HomeActivity extends BaseActivity implements OnClickListener {

	// 标题栏
	private TitleBar mtitleBar;
	// 自定义侧滑菜单栏
	private SlidingMenu mMenu;
	// 首页扩展列表
	private ExpandableListView home_elistview;
	// 扩展列表适配器
	private Expandable_Adapter elist_adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);		
		initTitleBar();//初始化标题栏
		initView();//初始化控件
		
	}
	//初始化标题栏
	private void initTitleBar() {
		mtitleBar = (TitleBar) findViewById(R.id.titlebar);
		mtitleBar.setTitle("Aquacultrue", HomeActivity.this);
		mtitleBar.addLeftTitleBtn(this, this);
	}

	//初始化控件
	private void initView() {
		// 自定义侧滑菜单栏
		mMenu = (SlidingMenu) findViewById(R.id.id_menu);

		home_elistview=(ExpandableListView)this.findViewById(R.id.home_expandable_listview);
		elist_adapter=new Expandable_Adapter(this);
		home_elistview.setAdapter(elist_adapter);
	}
	
	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.left_titlebar_layout:
			mMenu.toggle();
			break;	
		}
		
	}
	

}
