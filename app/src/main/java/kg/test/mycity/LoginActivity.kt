package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)

        val login2 = findViewById<ImageButton>(R.id.login2)

        login2.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }

        val textView24 = findViewById<TextView>(R.id.textView24)

        textView24.setOnClickListener {
            startActivity(Intent(this, SigninActivity::class.java))
            finish()

        }


    }
}