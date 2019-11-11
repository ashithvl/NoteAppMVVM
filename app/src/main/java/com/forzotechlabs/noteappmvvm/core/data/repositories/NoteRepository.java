package com.forzotechlabs.noteappmvvm.core.data.repositories;

import androidx.lifecycle.LiveData;

import com.forzotechlabs.noteappmvvm.core.data.local.room.dao.NoteDao;
import com.forzotechlabs.noteappmvvm.core.data.local.room.entities.Note;

import java.util.List;

/**
 * @link www.freshlancers.com
 * @created on 11-11-19
 */
public class NoteRepository {

    private final NoteDao noteDao;

    public NoteRepository(NoteDao noteDao) {
        this.noteDao = noteDao;
    }

    public void insert(Note note) {
        noteDao.insert(note);
    }

    public void update(Note note) {
        noteDao.update(note);
    }

    public void delete(Note note) {
        noteDao.delete(note);
    }

    public void deleteAllNotes() {
        noteDao.deleteAllNotes();
    }

    public LiveData<List<Note>> getAllNotes() {
        return noteDao.getAllNotes();
    }
}