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
 * 首页扩展列表适配器
 * @author YZX.2015.5.18
 *
 */
public class Expandable_Adapter extends BaseExpandableListAdapter{

	private LayoutInflater mInflater;
	
	//设置组视图的显示文字
    private String[] generalsTypes = new String[] { "Aquacultrue*实时监控", "Aquacultrue*历史走向", "Aquacultrue*最新咨询", "Aquacultrue*养殖助手"};
    //子视图显示文字
    private String[][] generals = new String[][] {
            { "PH：26", "溶解氧:0", "水温度:0", "空气温度:0","空气湿度:0","电流:0"},
            { "当天走向", "本周走向", "本月走向", "季度走向" },
            { "气候预报", "商业解读","行业预测"},
            { "水产养殖10个秘籍", "夏季养殖注意事项"}};
    //组视图背景
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
		
		//设置箭头方向
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
