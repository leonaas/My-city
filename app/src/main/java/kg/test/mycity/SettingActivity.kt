package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        val ImageButton = findViewById<ImageButton>(R.id.imageView8)

        ImageButton.setOnClickListener{
            startActivity(Intent(this,menu::class.java))
            finish()
        }
    }
}