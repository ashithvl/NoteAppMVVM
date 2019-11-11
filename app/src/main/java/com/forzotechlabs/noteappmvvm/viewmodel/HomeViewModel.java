package com.forzotechlabs.noteappmvvm.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.forzotechlabs.noteappmvvm.core.data.local.room.NoteDatabase;
import com.forzotechlabs.noteappmvvm.core.data.local.room.entities.Note;
import com.forzotechlabs.noteappmvvm.core.data.repositories.NoteRepository;

import java.util.List;

public class HomeViewModel extends AndroidViewModel {
    private NoteRepository repository;
    private LiveData<List<Note>> allNotes;
    private NoteDatabase database;

    public HomeViewModel(@NonNull Application application) {
        super(application);
        database = NoteDatabase.getInstance(application);
        repository = new NoteRepository(database.noteDao());
        allNotes = repository.getAllNotes();
    }

    public void insert(Note note) {
        repository.insert(note);
    }

    public void update(Note note) {
        repository.update(note);
    }

    public void delete(Note note) {
        repository.delete(note);
    }

    public void deleteAllNotes() {
        repository.deleteAllNotes();
    }

    public LiveData<List<Note>> getAllNotes() {
        return allNotes;
    }
}