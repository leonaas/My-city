package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class ObrasheniyaPhotoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obrasheniyaphoto)

        val back = findViewById<ImageButton>(R.id.back)

        back.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }

        val delete = findViewById<ImageView>(R.id.delete)

        delete.setOnClickListener {
            startActivity(Intent(this, ObrasheniyaVyborActivity::class.java))
            finish()
        }

        val camera = findViewById<ImageButton>(R.id.camera)

        camera.setOnClickListener {
            startActivity(Intent(this, ObrasheniyaVyborActivity::class.java))
            finish()
        }

        val send = findViewById<Button>(R.id.send)

        send.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
    }
}