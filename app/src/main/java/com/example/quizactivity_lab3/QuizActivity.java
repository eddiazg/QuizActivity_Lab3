package com.example.quizactivity_lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import static com.example.quizactivity_lab3.R.string.correct_toast;

public class QuizActivity extends AppCompatActivity {

    private static final String TAG = "QuizActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void ClickDisplayCorrectToast(View view) {
        Toast.makeText(this, correct_toast,Toast.LENGTH_SHORT).show();
    }

    @Override
    public  void onStart(){
        super.onStart();
        Log.d(TAG, "onStart() called");
    }
@Override
    public  void onResume(){
        super.onResume();
        Log.d(TAG, "onResume() called");
    }
@Override
    public  void onPause(){
        super.onPause();
        Log.d(TAG, "onPause() called");
    }
@Override
    public  void onStop(){
        super.onStop();
        Log.d(TAG, "onStop() called");

    }
public void onDestroy(){
        super.onDestroy();
    Log.d(TAG, "onDestroy() called");

}


}
