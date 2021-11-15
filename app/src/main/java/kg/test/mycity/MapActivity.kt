package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val vodokanal = findViewById<TextView>(R.id.vodokanal)

        vodokanal.setOnClickListener {
            startActivity(Intent(this,MapPoiskActivity::class.java))
            finish()
        }
    }
}