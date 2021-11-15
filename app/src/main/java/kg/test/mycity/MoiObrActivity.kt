package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MoiObrActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moi_obr)

        val backk = findViewById<ImageButton>(R.id.backk)

        backk.setOnClickListener{
            startActivity(Intent(this,MenuActivity::class.java))
            finish()
        }

        val next_to_one_obr = findViewById<ImageButton>(R.id.next_to_one_obr)

        next_to_one_obr.setOnClickListener{
            startActivity(Intent(this,PodrobnoeobrasheniyeActivity::class.java))
            finish()
        }

        val next_to_two_obr = findViewById<ImageView>(R.id.next_to_two_obr)

        next_to_two_obr.setOnClickListener{
            startActivity(Intent(this,PodrobnoeobrasheniyeActivity::class.java))
            finish()
        }

        val next_to_three_obr = findViewById<ImageView>(R.id.next_to_three_obr)

        next_to_three_obr.setOnClickListener{
            startActivity(Intent(this,PodrobnoeobrasheniyeActivity::class.java))
            finish()
        }

        val next_to_four_obr = findViewById<ImageView>(R.id.next_to_four_obr)

        next_to_four_obr.setOnClickListener{
            startActivity(Intent(this,PodrobnoeobrasheniyeActivity::class.java))
            finish()
        }
    }
}