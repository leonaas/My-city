package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_signin)

        val sign_in_button = findViewById<ImageButton>(R.id.sign_in_button)

        sign_in_button.setOnClickListener {
            startActivity(Intent(this, CodephoneActivity::class.java))
            finish()
        }
    }
}