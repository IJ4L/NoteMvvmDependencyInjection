package com.dewakoding.tutorialmvvm.ui.addnote

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dewakoding.tutorialmvvm.databinding.ActivityAddBinding

class AddNoteActivity: AppCompatActivity() {
    private val binding by lazy { ActivityAddBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}