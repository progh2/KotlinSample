package kr.hs.emirim.progh2.kotlinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_control.*
import kotlinx.android.synthetic.main.layout_variable.*
import kotlinx.android.synthetic.main.layout_variable.button

class ControlKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_control)

        button.setOnClickListener {
            val number = numberField.text.toString().toInt()

            when{
                number % 2 == 0 ->  Toast.makeText(applicationContext,
                    "2의 배수 : ${number}",
                    Toast.LENGTH_SHORT).show()
                number % 3 == 0 -> Toast.makeText(applicationContext,
                    "3의 배수 : ${number}",
                    Toast.LENGTH_SHORT).show()
                else -> Toast.makeText(applicationContext,
                    "${number}",
                    Toast.LENGTH_SHORT).show()
            }

//            if(number % 2 == 0){
//                Toast.makeText(applicationContext,
//                    "2의 배수 : ${number}",
//                    Toast.LENGTH_SHORT).show()
//            }else if(number % 3 == 0){
//                Toast.makeText(applicationContext,
//                    "3의 배수 : ${number}",
//                    Toast.LENGTH_SHORT).show()
//            }else{
//                Toast.makeText(applicationContext,
//                    "${number}",
//                    Toast.LENGTH_SHORT).show()
//            }

            when(number){
                4 -> button.text = "실행 - 4"
                9 -> {
                    button.text = "실행 - 9"
                }
                else -> button.text = "실행"
            }
        }
    }
}
