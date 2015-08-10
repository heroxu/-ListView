package com.itheima.xlistview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.itheima.xlistview.ui.PullToRefreshListView;

public class MainActivity extends Activity {

	private PullToRefreshListView ptrlv;
	/**
	 * 新闻的标题集合
	 */
	private List<String> newsTitle;
	
	private MyAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		newsTitle = new ArrayList<String>();
		newsTitle.add("张三偷了奥巴马的高压锅");
		newsTitle.add("李四偷了奥巴马的高压锅");
		newsTitle.add("王五偷了奥巴马的高压锅");
		newsTitle.add("赵六偷了奥巴马的高压锅");
		newsTitle.add("钱七偷了奥巴马的高压锅");
		newsTitle.add("钱七偷了奥巴马的高压锅");
		newsTitle.add("习近平：听党指挥");
		
		newsTitle.add("支持武威有希望");
		newsTitle.add("宁泽涛的了金牌");
		newsTitle.add("宁泽涛的了金牌+1");
		newsTitle.add("宁泽涛的了金牌+2");
		newsTitle.add("宁泽涛的了金牌+3");
		newsTitle.add("宁泽涛的了金牌+3");
		newsTitle.add("宁泽涛的了金牌+5");
		
		
		ptrlv = (PullToRefreshListView) findViewById(R.id.ptrlv);
		adapter = new MyAdapter();
		ptrlv.setAdapter(adapter);
	}

	private class MyAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			return newsTitle.size();
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			TextView tv = new TextView(getApplicationContext());
			tv.setTextSize(20);
			tv.setPadding(20, 20, 20, 20);
			tv.setTextColor(Color.BLACK);
			tv.setText(newsTitle.get(position));
			return tv;
		}

		@Override
		public Object getItem(int position) {
			return null;
		}

		@Override
		public long getItemId(int position) {
			return 0;
		}

	}

}
