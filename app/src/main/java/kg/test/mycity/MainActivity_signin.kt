package kg.test.mycity

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class MainActivity_signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_signin)

        val imageButton = findViewById<ImageButton>(R.id.imageView17)

        imageButton.setOnClickListener {
            startActivity(Intent(this, Code_phone::class.java))
            finish()
        }
    }
}