package com.aquacultrue.activity;

import com.aquacultrue.app.R;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
/**
 * ��ҳ��չ�б�������
 * @author YZX.2015.5.18
 *
 */
public class Expandable_Adapter extends BaseExpandableListAdapter{

	private LayoutInflater mInflater;
	
	//��������ͼ����ʾ����
    private String[] generalsTypes = new String[] { "Aquacultrue*ʵʱ���", "Aquacultrue*��ʷ����", "Aquacultrue*������ѯ", "Aquacultrue*��ֳ����"};
    //����ͼ��ʾ����
    private String[][] generals = new String[][] {
            { "PH��26", "�ܽ���:0", "ˮ�¶�:0", "�����¶�:0","����ʪ��:0","����:0"},
            { "��������", "��������", "��������", "��������" },
            { "����Ԥ��", "��ҵ���","��ҵԤ��"},
            { "ˮ����ֳ10���ؼ�", "�ļ���ֳע������"}};
    //����ͼ����
    private int[] imgs=new int[]{R.drawable.home_item1,R.drawable.home_item2,R.drawable.home_item3,R.drawable.home_item4};

    
    public Expandable_Adapter(Context context){
    	mInflater = LayoutInflater.from(context);
    }
	@Override
	public Object getChild(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return generals[groupPosition][childPosition];
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return childPosition;
	}

	@Override
	public int getChildrenCount(int position) {
		// TODO Auto-generated method stub
		return generals[position].length;
	}

	@Override
	public Object getGroup(int position) {
		// TODO Auto-generated method stub
		return generalsTypes[position];
	}

	@Override
	public int getGroupCount() {
		// TODO Auto-generated method stub
		return generalsTypes.length;
	}

	@Override
	public long getGroupId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
            View convertView, ViewGroup parent) {

		convertView=mInflater.inflate(R.layout.list_home_groud, null);
		
		RelativeLayout layout=(RelativeLayout)convertView.findViewById(R.id.layout);
		TextView group_name=(TextView)convertView.findViewById(R.id.groud_name);
		ImageView group_logo=(ImageView)convertView.findViewById(R.id.groud_logo);
		ImageView group_direction=(ImageView)convertView.findViewById(R.id.group_direction);
		
		//���ü�ͷ����
		if(isExpanded){
			group_direction.setImageResource(R.drawable.up_logo);
		}else{
			group_direction.setImageResource(R.drawable.down_logo);
		}
		layout.setBackgroundResource(imgs[groupPosition]);
		group_name.setText(generalsTypes[groupPosition]);
		
		return convertView;
	}
	@Override
	public View getChildView(int groupPosition, int childPosition,
            boolean isLastChild, View convertView, ViewGroup parent) {

		convertView=mInflater.inflate(R.layout.list_home_child, null);
		
		TextView child_name=(TextView)convertView.findViewById(R.id.child_name);
		child_name.setText(generals[groupPosition][childPosition]);
		
		return convertView;
	}
	
	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isChildSelectable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}

}
