package kg.test.mycity

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Code_phone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_phone)

        val ImageButton = findViewById<ImageButton>(R.id.imageButton3)

        ImageButton.setOnClickListener{
            startActivity(Intent(this,menu::class.java))
            finish()
        }
    }
}