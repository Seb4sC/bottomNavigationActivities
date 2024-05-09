package com.servicioscm.pruebas

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.servicioscm.pruebas.databinding.ActivityFilesBinding

class FilesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFilesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFilesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bottomMenu.selectedItemId = R.id.files
        binding.bottomMenu.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.home -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    true
                }
                R.id.files -> {
                    startActivity(Intent(this, FilesActivity::class.java))
                    true
                }
                R.id.settings -> {
                    startActivity(Intent(this, SettingsActivity::class.java))
                    true
                }
                else -> false
            }
        }
    }
}