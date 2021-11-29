package id.ac.umn.zonaegg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.umn.zonaegg.databinding.ActivityCreditsBinding

class CreditsActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCreditsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreditsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Back button
        binding.creditsBtnBack.setOnClickListener {

        }
    }
}