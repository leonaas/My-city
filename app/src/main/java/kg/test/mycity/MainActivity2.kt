package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import kg.test.mycity.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val ImageButton = findViewById<ImageButton>(R.id.imageView6)

        ImageButton.setOnClickListener {
            startActivity(Intent(this, menu::class.java))
            finish()
        }
    }
}