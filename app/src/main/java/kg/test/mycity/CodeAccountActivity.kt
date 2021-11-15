package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class CodeAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_account)

        val ImageButton = findViewById<ImageButton>(R.id.imageButton3)

        ImageButton.setOnClickListener{
            startActivity(Intent(this,MenuActivity::class.java))
            finish()
        }
    }
}