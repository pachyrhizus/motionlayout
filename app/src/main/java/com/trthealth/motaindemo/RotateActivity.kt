package com.trthealth.motaindemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout

/**
 * 旋转
 */
class RotateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rotate)
//        val set = findViewById<MotionLayout>(R.id.motionLayout).getConstraintSet(R.id.end)
//        set.setRotation(R.id.view, 900f)
//        findViewById<MotionLayout>(R.id.motionLayout).updateState(R.id.end, set)
    }
}