package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Obrasheniya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obrasheniya)

        val ImageButton = findViewById<ImageButton>(R.id.imageView6)

        ImageButton.setOnClickListener{
            startActivity(Intent(this,menu::class.java))
            finish()
        }
    }
}