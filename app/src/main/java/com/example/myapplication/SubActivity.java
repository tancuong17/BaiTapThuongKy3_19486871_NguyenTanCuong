package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    int luachon;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sub);
        ImageView imagePhoneSub =  findViewById(R.id.imagePhoneSub);
        TextView infoPhoneSub = findViewById(R.id.infoPhoneSub);
        TextView blackColor = findViewById(R.id.blackColor);
        TextView whiteColor = findViewById(R.id.whiteColor);
        TextView redColor = findViewById(R.id.redColor);
        TextView blueColor = findViewById(R.id.blueColor);
        Button chooseColorSub = findViewById(R.id.chooseColorSub);
        blackColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                luachon = 1;
                imagePhoneSub.setImageResource(R.drawable.iphone12den);
                infoPhoneSub.setText("Điện thoại IPHONE 12\nHàng chính hãng\nMàu: đen\nCung cấp bởi: Tiki Tradding\n19.690.000 đ");
            }
        });
        whiteColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                luachon = 2;
                imagePhoneSub.setImageResource(R.drawable.iphone12trang);
                infoPhoneSub.setText("Điện thoại IPHONE 12\nHàng chính hãng\nMàu: trắng\nCung cấp bởi: Tiki Tradding\n19.690.000 đ");
            }
        });
        redColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                luachon = 3;
                imagePhoneSub.setImageResource(R.drawable.iphone12do);
                infoPhoneSub.setText("Điện thoại IPHONE 12\nHàng chính hãng\nMàu: đỏ\nCung cấp bởi: Tiki Tradding\n19.690.000 đ");
            }
        });
        blueColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                luachon = 4;
                imagePhoneSub.setImageResource(R.drawable.iphone12xanh);
                infoPhoneSub.setText("Điện thoại IPHONE 12\nHàng chính hãng\nMàu: xanh\nCung cấp bởi: Tiki Tradding\n19.690.000 đ");
            }
        });
        chooseColorSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("imageBG", Integer.toString(luachon));
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
