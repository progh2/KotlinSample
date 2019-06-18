package kr.hs.emirim.progh2.kotlinsample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnJava.setOnClickListener{
            startActivity(
                Intent(this,
                    BmiJavaActivity::class.java))
        }
        btnKotlin.setOnClickListener{
            startActivity(
                Intent(this,
                    BmiKotlinActivity::class.java))
        }
        button3.setOnClickListener{
            startActivity(
                Intent(this,
                    VariableJavaActivity::class.java)
            )
        }
        button4.setOnClickListener {
            startActivity(
                Intent(this,
                VariableKotlinActivity::class.java)
            )
        }
    }
}
