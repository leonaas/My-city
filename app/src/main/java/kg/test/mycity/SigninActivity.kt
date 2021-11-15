package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_signin)

        val imageButton = findViewById<ImageButton>(R.id.imageView17)

        imageButton.setOnClickListener {
            startActivity(Intent(this, CodephoneActivity::class.java))
            finish()
        }
    }
}