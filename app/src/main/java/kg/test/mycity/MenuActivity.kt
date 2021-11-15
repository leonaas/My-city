package kg.test.mycity

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)

        val obrasheniyabutton = findViewById<ImageButton>(R.id.obrasheniyabutton)

        obrasheniyabutton.setOnClickListener {
            startActivity(Intent(this,ObrasheniyaActivity::class.java))
            finish()
        }

        val moi_obrasheniya = findViewById<ImageButton>(R.id.moi_obrasheniya)

        moi_obrasheniya.setOnClickListener {
            startActivity(Intent(this,MoiObrActivity::class.java))
            finish()
        }

        val mapbutton = findViewById<ImageButton>(R.id.mapbutton)

        mapbutton.setOnClickListener {
            startActivity(Intent(this,MapActivity::class.java))
            finish()
        }

        val settings = findViewById<ImageButton>(R.id.settings)

        settings.setOnClickListener {
            startActivity(Intent(this,SettingActivity::class.java))
            finish()
        }

        val accountbutton = findViewById<ImageButton>(R.id.accountbutton)

        accountbutton.setOnClickListener {
            startActivity(Intent(this,AccountActivity::class.java))
            finish()
        }
    }
}