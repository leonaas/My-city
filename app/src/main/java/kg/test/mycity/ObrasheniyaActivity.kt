package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ObrasheniyaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obrasheniya)

        val back = findViewById<ImageButton>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,MenuActivity::class.java))
            finish()
        }

        val camera = findViewById<ImageButton>(R.id.camera)

        camera.setOnClickListener{
            startActivity(Intent(this,ObrasheniyaVyborActivity::class.java))
            finish()
        }
    }
}