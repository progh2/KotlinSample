package kr.hs.emirim.progh2.kotlinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_variable.*
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {

    var clickCount = 0
    val startTime = System.currentTimeMillis()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        val timeText = SimpleDateFormat(
            "HH:mm:ss", Locale.KOREA).format(startTime);

        startTimeLabel.setText("Activity 시작 시간 : ${timeText}")
        clickCountLabel.setText("버튼이 클릭된 횟수 : ${clickCount}")

        button.setOnClickListener {
            clickCount ++
            clickCountLabel.setText("버튼이 클릭된 횟수 : ${clickCount}")
        }
    }
}
