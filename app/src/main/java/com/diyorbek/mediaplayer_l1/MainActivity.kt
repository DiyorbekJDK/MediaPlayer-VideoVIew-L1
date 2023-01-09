package com.diyorbek.mediaplayer_l1

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.diyorbek.mediaplayer_l1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()
        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.videoView)
        binding.videoView.setVideoURI(Uri.parse("android.resource://$packageName/${R.raw.viu}"))
        binding.videoView.setMediaController(mediaController)
        binding.videoView.start()
    }
}