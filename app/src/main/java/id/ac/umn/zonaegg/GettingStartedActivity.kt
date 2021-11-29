package id.ac.umn.zonaegg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.umn.zonaegg.databinding.ActivityGettingStartedBinding

class GettingStartedActivity : AppCompatActivity() {

    private lateinit var binding : ActivityGettingStartedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGettingStartedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Getting Started button
        binding.gettingStartedBtnGettingStarted.setOnClickListener {

        }
    }
}