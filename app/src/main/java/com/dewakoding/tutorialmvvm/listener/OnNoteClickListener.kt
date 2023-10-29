package com.dewakoding.tutorialmvvm.listener

import com.dewakoding.tutorialmvvm.data.model.Note

interface OnNoteClickListener {
    fun onDelete(note: Note)

    fun onEdit(note: Note)
}