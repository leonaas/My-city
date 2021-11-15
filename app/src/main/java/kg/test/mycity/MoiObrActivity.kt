package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MoiObrActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moi_obr)

        val ImageButton = findViewById<ImageButton>(R.id.backk)

        ImageButton.setOnClickListener{
            startActivity(Intent(this,MenuActivity::class.java))
            finish()
        }
    }
}