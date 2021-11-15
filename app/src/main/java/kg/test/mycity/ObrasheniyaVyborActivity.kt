package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout

class ObrasheniyaVyborActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obrasheniyavybor)

        val back = findViewById<ImageButton>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,ObrasheniyaActivity::class.java))
            finish()
        }

        val image = findViewById<LinearLayout>(R.id.image)

        image.setOnClickListener{
            startActivity(Intent(this,ObrasheniyaPhotoActivity::class.java))
            finish()
        }
    }
}