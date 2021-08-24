package com.trthealth.motaindemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.line).setOnClickListener(this)
        findViewById<TextView>(R.id.curve).setOnClickListener(this)
        findViewById<TextView>(R.id.cycle).setOnClickListener(this)
        findViewById<TextView>(R.id.rotate).setOnClickListener(this)
        findViewById<TextView>(R.id.swing).setOnClickListener(this)
        findViewById<TextView>(R.id.transit).setOnClickListener(this)
        findViewById<TextView>(R.id.word).setOnClickListener(this)
        findViewById<TextView>(R.id.picture).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.line -> {
                startActivity(Intent(this, LineActivity::class.java))
            }
            R.id.curve -> {
                startActivity(Intent(this, CurveActivity::class.java))
            }
            R.id.cycle -> {
                startActivity(Intent(this, CycleActivity::class.java))
            }
            R.id.rotate -> {
                startActivity(Intent(this, RotateActivity::class.java))
            }
            R.id.swing -> {
                startActivity(Intent(this, SwingingActivity::class.java))
            }
            R.id.transit -> {
                startActivity(Intent(this, TransitActivity::class.java))
            }
            R.id.word -> {
                startActivity(Intent(this, WordActivity::class.java))
            }
            R.id.picture -> {
                startActivity(Intent(this, PictureActivity::class.java))
            }
        }
    }
}