package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class CodephoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_phone)

        val imageButton3 = findViewById<ImageButton>(R.id.imageButton3)

        imageButton3.setOnClickListener{
            startActivity(Intent(this,MenuActivity::class.java))
            finish()
        }
    }
}