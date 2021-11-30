package id.ac.umn.zonaegg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import id.ac.umn.zonaegg.databinding.ActivityRegisterBinding
import java.lang.Exception

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
            var username = ""
            var email = ""
            var password = ""

            // Try username
            try {
                username = binding.registerEtUsername.text.toString()
            }
            catch (e : Exception) {
                binding.registerTvUsernameError.isVisible = true
            }

            // Try email
            try {
                email = binding.registerEtEmail.text.toString()
            }
            catch (e : Exception) {
                binding.registerTvEmailError.isVisible = true
            }

            // Try password
            try {
                password = binding.registerEtPassword.text.toString()
            }
            catch (e : Exception) {
                binding.registerTvPasswordError.isVisible = true
            }

            // If register data valid
            if (isRegisterDataValid(username, email, password)) {

            }
            // If register data invalid
            else {

            }
        }
    }

    private fun isRegisterDataValid(username : String, email : String, password : String) : Boolean {
        if (username == "" || email == "" || password == "")
            return false
        return true
    }
}