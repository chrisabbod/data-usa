package com.chrisabbod.data_usa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.text.toSpannable
import com.chrisabbod.data_usa.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setTitleColor()

        binding.btnLogin.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    MainActivity::class.java
                )
            )
        }
    }

    private fun setTitleColor() {
        val span: Spannable = resources.getString(R.string.app_name).toSpannable()

        span.setSpan(
            ForegroundColorSpan(ContextCompat.getColor(this, R.color.red)),
            5,
            6,
            Spannable.SPAN_EXCLUSIVE_INCLUSIVE
        )
        span.setSpan(
            ForegroundColorSpan(ContextCompat.getColor(this, R.color.gray)),
            6,
            7,
            Spannable.SPAN_EXCLUSIVE_INCLUSIVE
        )
        span.setSpan(
            ForegroundColorSpan(ContextCompat.getColor(this, R.color.blue)),
            7,
            8,
            Spannable.SPAN_EXCLUSIVE_INCLUSIVE
        )
        binding.tvLoginTitle.text = span
    }
}