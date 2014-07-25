package com.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	/*ͨ��ʹ��Ӧ�ó��������Ϊǰ׺��������ͼ�������������������з��� */
	public final static String EXTRA_MESSAGE = "com.test.MESSAGE";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btnSend = (Button) this.findViewById(R.id.send);
		btnSend.setOnClickListener(new SendButtonClickListener());
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		//�������ϰ�ť
		//minSdkVersion = 11 �����ϰ汾ʹ�����ַ�ʽ��
		//����ʹ��getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		// ��app icon ���óɿ��õ����ϰ�ť
		}
	
	private final class SendButtonClickListener implements View.OnClickListener{
		@Override
		public void onClick(View v) {
		}
	}
	
	/*
	 * ������������������
	 * 1��������public;2,����ֵ��void��
	 * 3����һ��Ψһ����ͼ��View�������������ͼ���ǽ����������ͼ��
	 */
	public void send2(View v){
		EditText edit = (EditText) this.findViewById(R.id.textEdit);
		String message = edit.getText().toString();
		
		/*�˴�֮���п�����this����Ϊ��ǰActivity(MainActivity)��Context������*/
		Intent intent = new Intent(this,DispalyMessageActivity.class);
		intent.putExtra(EXTRA_MESSAGE,message);
		startActivity(intent);
	}
	
	/*Ϊ action bar ���ֲ˵���Ŀ��
	 * ��ͨ���� activity ��ʵ�� onCreateOptionsMenu()) �ص�����
	 * �� inflate �˵���Դ�Ӷ���ȡ Menu ����*/
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//Ϊʹ��action bar�����menu items
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_activity_actions, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()){
		case R.id.action_search:
			openSearch();
			return true;
		case R.id.action_settings:
			openSettings();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	private void openSettings() {
		// TODO Auto-generated method stub
		
	}

	private void openSearch() {
		// TODO Auto-generated method stub
		
	}
}
