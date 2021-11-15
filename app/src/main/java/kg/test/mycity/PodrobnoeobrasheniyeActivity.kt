package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class PodrobnoeobrasheniyeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_podrobnoeobrasheniye)

        val back = findViewById<ImageButton>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,MoiObrActivity::class.java))
            finish()
        }
    }
}