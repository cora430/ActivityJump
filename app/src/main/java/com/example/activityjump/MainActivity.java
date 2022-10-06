package com.example.activityjump;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
//G1
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toCustom(View view) {
        Intent intent = new Intent();
        intent.setAction("com.example.activityjump.CustomActivity");


        startActivity(intent);
    }

    public void toBaidu(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.baidu.com"));
        startActivity(intent);
    }

    public void toCamera(View view) {

        Intent intent  = new Intent();
        intent.setAction("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);

    }

    public void toPhoto(View view) {
        Intent intent  = new Intent();
        intent.setAction("android.intent.action.PICK");
        intent.setType("image/*");
        startActivity(intent);
    }


    public void toTel(View view) {
        Intent intent  = new Intent();
        intent.setAction(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:110"));
        startActivity(intent);

    }

    public void toMessage(View view) {
        Intent intent  = new Intent();
        intent.setAction(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("smsto:19357510685"));
        intent.putExtra("sms_body","你好这里是cora");
        startActivity(intent);
    }
}