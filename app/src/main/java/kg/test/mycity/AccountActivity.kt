package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val edit_profile = findViewById<TextView>(R.id.edit_profile)

        edit_profile.setOnClickListener {
            startActivity(Intent(this, AccountRedActivity::class.java))
            finish()
        }

        val bacck = findViewById<ImageView>(R.id.bacck)

        bacck.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
    }
}