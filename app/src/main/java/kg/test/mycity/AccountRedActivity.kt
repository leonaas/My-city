package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class AccountRedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_red)

        val gotovo = findViewById<Button>(R.id.gotovo)

        gotovo.setOnClickListener {
            startActivity(Intent(this, AccountActivity::class.java))
            finish()
        }

        val backk = findViewById<ImageView>(R.id.backk)

        backk.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
    }
}