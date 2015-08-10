package com.itheima.xlistview.ui;

import com.itheima.xlistview.R;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
/**
 * ����ˢ�µ�listview
 */
public class PullToRefreshListView extends ListView {
	/**
	 * ����ˢ�µı���view
	 */
	private View headerView;
	/**
	 * ���췽��
	 * @param context
	 * @param attrs
	 */
	public PullToRefreshListView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initHeader(context);
	}
	/**
	 * ���췽��
	 * @param context
	 */
	public PullToRefreshListView(Context context) {
		super(context);
		initHeader(context);
	}

	
	/**
	 * ��ʼ��listview��ͷ
	 * @param context
	 */
	private void initHeader(Context context) {
		headerView = View.inflate(context, R.layout.list_header, null);
		addHeaderView(headerView);
		headerView.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		System.out.println("headerview:"+headerView);
		headerView.measure(0, 0);
		System.out.println(headerView.getMeasuredHeight());
	}
}
