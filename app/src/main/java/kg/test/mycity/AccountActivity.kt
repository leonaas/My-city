package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import org.w3c.dom.Text

class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val TextView = findViewById<TextView>(R.id.textView8)

        TextView.setOnClickListener {
            startActivity(Intent(this, AccountRedActivity::class.java))
            finish()
        }
    }
}