package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)
        val CardView = findViewById<CardView>(R.id.obrasheniya)

        CardView.setOnClickListener {
            startActivity(Intent(this,Obrasheniya::class.java))
            finish()
        }
    }
}