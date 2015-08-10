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
	 * ���ŵı��⼯��
	 */
	private List<String> newsTitle;
	
	private MyAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		newsTitle = new ArrayList<String>();
		newsTitle.add("����͵�˰°���ĸ�ѹ��");
		newsTitle.add("����͵�˰°���ĸ�ѹ��");
		newsTitle.add("����͵�˰°���ĸ�ѹ��");
		newsTitle.add("����͵�˰°���ĸ�ѹ��");
		newsTitle.add("Ǯ��͵�˰°���ĸ�ѹ��");
		newsTitle.add("Ǯ��͵�˰°���ĸ�ѹ��");
		newsTitle.add("ϰ��ƽ������ָ��");
		
		newsTitle.add("֧��������ϣ��");
		newsTitle.add("�����ε��˽���");
		newsTitle.add("�����ε��˽���+1");
		newsTitle.add("�����ε��˽���+2");
		newsTitle.add("�����ε��˽���+3");
		newsTitle.add("�����ε��˽���+3");
		newsTitle.add("�����ε��˽���+5");
		
		
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
