package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imagePhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        TextView chooseColor = findViewById(R.id.chooseColor);
        imagePhone = findViewById(R.id.imagePhone);
        chooseColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivityForResult(intent, 9999);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 9999 && resultCode == RESULT_OK) {
            Toast.makeText(this, "Đã chọn màu thành công!", Toast.LENGTH_SHORT).show();
            if (Integer.parseInt(data.getStringExtra("imageBG")) == 2)
                imagePhone.setImageResource(R.drawable.iphone12trang);
            else if(Integer.parseInt(data.getStringExtra("imageBG")) == 3)
                imagePhone.setImageResource(R.drawable.iphone12do);
            else if (Integer.parseInt(data.getStringExtra("imageBG")) == 4)
                imagePhone.setImageResource(R.drawable.iphone12xanh);
            else
                imagePhone.setImageResource(R.drawable.iphone12den);
        }
    }
}