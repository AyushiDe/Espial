package com.android.espial;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class DetectionActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detection);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnTextRecog)
    void onClickBtntextrecog() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnFaceDetect)
    void onClickBtnfacedetect() {
        Intent intent = new Intent(this,FaceDetectActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnBarDetect)
    void onClickBarDetect(){
        Intent intent = new Intent(this,BarCodeScannerActivity.class);
        startActivity(intent);
    }


}
