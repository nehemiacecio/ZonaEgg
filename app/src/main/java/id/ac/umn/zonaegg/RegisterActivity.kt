package id.ac.umn.zonaegg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.umn.zonaegg.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding : ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Back button
        binding.registerBtnBack.setOnClickListener {
            finish()
        }

        // Register button
        binding.registerBtnRegister.setOnClickListener {

        }
    }
}