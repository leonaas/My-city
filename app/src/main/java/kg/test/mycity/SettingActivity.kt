package kg.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        val back = findViewById<ImageButton>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,MenuActivity::class.java))
            finish()
        }

        val delete_account = findViewById<Button>(R.id.delete_account)

        delete_account.setOnClickListener{
            startActivity(Intent(this,SigninActivity::class.java))
            finish()
        }
    }
}