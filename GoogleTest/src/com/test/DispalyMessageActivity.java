package com.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DispalyMessageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dispaly_message);

		super.onCreate(savedInstanceState);
		/*�����ʵ��ʱϵͳ�����onCreate()����*/
		setContentView(R.layout.activity_main);
		/* setContentView()������Activity���֣��Զ�Activity���г�ʼ��*/
		
		//��intent�õ�message com.example.myfirstapp.MESSAGE
		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		
		//������ʾ��view
		TextView textView = new TextView(this);
		textView.setTextSize(40);
		textView.setText(message);
		
		//��view����Ϊ����
		setContentView(textView);
	}

	
}
