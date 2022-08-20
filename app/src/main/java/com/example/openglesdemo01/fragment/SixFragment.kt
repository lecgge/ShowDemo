package com.example.openglesdemo01.fragment

import android.opengl.GLSurfaceView
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.airhockey.AirHockeyRender.DemoRenderer05
import com.example.airhockey.AirHockeyRender.DemoRenderer06


class SixFragment : Fragment() {
    lateinit var glSurfaceView : GLSurfaceView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        glSurfaceView = GLSurfaceView(context)
        glSurfaceView.setEGLContextClientVersion(2)
        glSurfaceView.setRenderer(context?.let { DemoRenderer06(it) })
        glSurfaceView.renderMode = GLSurfaceView.RENDERMODE_CONTINUOUSLY

        return glSurfaceView
    }

    override fun onResume() {
        super.onResume()
        glSurfaceView.onResume()
    }

    override fun onPause() {
        super.onPause()
        glSurfaceView.onPause()
    }
}