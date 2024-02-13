package com.example.week2

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.week2.ui.theme.Week2Theme
import android.widget.EditText
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var mytext: TextView
    private lateinit var myedit: EditText
    private lateinit var mybutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize TextView, EditText, and Button
        mytext = findViewById(R.id.textview)
        myedit = findViewById(R.id.myedittext)
        mybutton = findViewById(R.id.mybutton)

        // Set hint for EditText
        myedit.hint = getString(R.string.hinttext)

        // Set OnClickListener for Button
        mybutton.setOnClickListener {
            // Get text from EditText
            val editString = myedit.text.toString()
            // Update text for TextView
            mytext.text = "Your edit text has: $editString"
            // Show Toast message
            showToast("Your edit text has: $editString")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Week2Theme {
        Greeting("Android")
    }
}