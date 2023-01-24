package com.example.speedy

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton;

class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_principal)
        supportActionBar?.hide()



        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener{

            val intent: Intent = Intent(this, PantallaPrincipal:: class.java)
            startActivity(intent)
        }

        val btn2: Button = findViewById(R.id.button2)
        btn2.setOnClickListener{
            val intent: Intent = Intent(this, PantallaSecundaria:: class.java)
            startActivity(intent)
        }

        val btn3: Button = findViewById(R.id.button3)
        btn3.setOnClickListener{
            val intent: Intent = Intent(this, PantallaTercearia:: class.java)
            startActivity(intent)
        }

        val btn4: ImageButton = findViewById(R.id.imageButton3)
        btn4.setOnClickListener{
            val url = "https://www.facebook.com/juansebastian.dazamenendez"
            val webPage = Uri.parse(url)
            val intent = Intent(Intent.ACTION_VIEW, webPage)
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }

        val btn5: ImageButton = findViewById(R.id.imageButton4)
        btn5.setOnClickListener{
            val url = "https://www.instagram.com/papi_juancho.priv/"
            val webPage = Uri.parse(url)
            val intent = Intent(Intent.ACTION_VIEW, webPage)
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }

        val btn6: ImageButton = findViewById(R.id.imageButton5)
        btn6.setOnClickListener{
            val url = "https://twitter.com/JuanDaza2004"
            val webPage = Uri.parse(url)
            val intent = Intent(Intent.ACTION_VIEW, webPage)
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }

}
}
