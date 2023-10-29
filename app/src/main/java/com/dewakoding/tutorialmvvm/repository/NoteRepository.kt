package com.dewakoding.tutorialmvvm.repository

import com.dewakoding.tutorialmvvm.data.dao.NoteDao
import com.dewakoding.tutorialmvvm.data.model.Note
import javax.inject.Inject

class NoteRepository @Inject constructor(private val noteDao: NoteDao) {

    fun getAll() = noteDao.getAll()

    suspend fun insert(note: Note) = noteDao.insert(note)

    suspend fun delete(note: Note) = noteDao.delete(note)

    suspend fun update(note: Note) = noteDao.update(note)
}