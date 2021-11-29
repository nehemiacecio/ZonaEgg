package id.ac.umn.zonaegg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.umn.zonaegg.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Back button
        binding.settingsBtnBack.setOnClickListener {

        }

        // Dark theme button
        binding.settingsBtnDarkTheme.setOnClickListener {

        }

        // Getting started button
        binding.settingsBtnGettingStarted.setOnClickListener {
            val gettingStarted = Intent(this, GettingStartedActivity::class.java)
            startActivity(gettingStarted)
        }

        // Homepage button
        binding.settingsBtnHomepage.setOnClickListener {

        }

        // Popular places button
        binding.settingsBtnPopularPlaces.setOnClickListener {

        }

        // Your favorites button
        binding.settingsBtnYourFavorites.setOnClickListener {

        }

        // Credits button
        binding.settingsBtnCredits.setOnClickListener {
            val credits = Intent(this, CreditsActivity::class.java)
            startActivity(credits)
        }
    }
}