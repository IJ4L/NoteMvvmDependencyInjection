package com.dewakoding.tutorialmvvm.ui.listnote

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dewakoding.tutorialmvvm.databinding.ActivityListBinding
import com.dewakoding.tutorialmvvm.ui.addnote.AddNoteActivity

class ListNoteActivity : AppCompatActivity() {
    private val binding by lazy { ActivityListBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.floatingActionButton.setOnClickListener {
            val intent = Intent(this@ListNoteActivity, AddNoteActivity::class.java)
            startActivity(intent)
        }
    }
}