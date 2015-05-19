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
 * ��ҳ
 * @author YZX.2015.5.18
 *
 */
public class HomeActivity extends BaseActivity implements OnClickListener {

	// ������
	private TitleBar mtitleBar;
	// �Զ���໬�˵���
	private SlidingMenu mMenu;
	// ��ҳ��չ�б�
	private ExpandableListView home_elistview;
	// ��չ�б�������
	private Expandable_Adapter elist_adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);		
		initTitleBar();//��ʼ��������
		initView();//��ʼ���ؼ�
		
	}
	//��ʼ��������
	private void initTitleBar() {
		mtitleBar = (TitleBar) findViewById(R.id.titlebar);
		mtitleBar.setTitle("Aquacultrue", HomeActivity.this);
		mtitleBar.addLeftTitleBtn(this, this);
	}

	//��ʼ���ؼ�
	private void initView() {
		// �Զ���໬�˵���
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
