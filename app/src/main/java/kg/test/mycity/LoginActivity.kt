package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`activity_main_login`)

        val imageButton = findViewById<ImageButton>(R.id.login2)

        imageButton.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }

        val TextView = findViewById<TextView>(R.id.textView24)

        TextView.setOnClickListener {
            startActivity(Intent(this, SigninActivity::class.java))
            finish()
        }
    }
}