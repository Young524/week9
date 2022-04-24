package com.example.contactstest;

import android.os.Bundle;
import android.app.Activity;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends Activity{
    private EditText edit;
    private EditText con;
    private Button bt;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt=(Button) findViewById(R.id.button);
        bt.setOnClickListener(new Click());
    }

    class Click implements OnClickListener
    {
        public void onClick(View v) {
            edit=(EditText) findViewById(R.id.mobile);
            con=(EditText) findViewById(R.id.content);
            // TODO Auto-generated method stub
            String number = edit.getText().toString();
            String content = con.getText().toString();
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(
                    number,// 收件人
                    null, // 短信中心号码
                    content, // 内容
                    null,
                    null);
        }
    }
}
