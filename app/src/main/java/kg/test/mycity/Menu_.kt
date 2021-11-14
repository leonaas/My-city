package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Menu_ : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)

        val ImageButton = findViewById<ImageButton>(R.id.moi_obrasheniya)

        ImageButton.setOnClickListener{
            startActivity(Intent(this,moi_obr::class.java))
            finish()
        }

        }
    }