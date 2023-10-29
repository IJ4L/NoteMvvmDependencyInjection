package com.dewakoding.tutorialmvvm.ui.addnote

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.dewakoding.tutorialmvvm.data.model.Note
import com.dewakoding.tutorialmvvm.databinding.ActivityAddBinding
import com.dewakoding.tutorialmvvm.viewmodel.NoteViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddNoteActivity: AppCompatActivity() {
    private val binding by lazy { ActivityAddBinding.inflate(layoutInflater) }
    private val noteViewModel: NoteViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.imgCheck.setOnClickListener {
            val titile = binding.etTitle.text.toString()
            val description = binding.etDescription.text.toString()

            if(titile.isEmpty() || description.isEmpty()){
                Toast.makeText(applicationContext, "Mohon isi data", Toast.LENGTH_SHORT).show()
            } else {
                noteViewModel.insert(Note(null, titile, description))
                Toast.makeText(applicationContext, "Sukses simpan data", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }


}