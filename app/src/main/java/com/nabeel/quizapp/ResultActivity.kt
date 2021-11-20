package com.nabeel.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN

        val username=intent.getStringExtra(Constants.USER_NAME)
        tv_name.text=username
        val totalQuestions=intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        if(a==0 && correctAnswers>5)
            tv_score.text="Congratulations! You have a healthy diet and lifestyle"

        else if (a==0 && correctAnswers<=5)
            tv_score.text="Sorry, You need to focus more on your diet and lifestyle"

        else if (a==1)
            tv_score.text="Your Score is $correctAnswers out of $totalQuestions"


        btn_finish.setOnClickListener(){
            a=0
            startActivity(Intent(this,SelectionScreen::class.java))
            finish()
        }

    }
}