package com.example.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.app2.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private RecyclerView javaLista;
    private List<Contact> lstContact = new ArrayList<>();
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        javaLista = findViewById(R.id.lista);

        Contact contact1 = new Contact("Ytalo","991284653",R.drawable.lolis,50);
        Contact contact2 = new Contact("Monroe","991284653",R.drawable.lolis,50);
        Contact contact3 = new Contact("Juan","991284653",R.drawable.lolis,50);
        Contact contact4 = new Contact("Pedro","991284653",R.drawable.lolis,50);
        Contact contact5 = new Contact("Alan","991284653",R.drawable.lolis,50);
        lstContact.add(contact1);
        lstContact.add(contact2);
        lstContact.add(contact3);
        lstContact.add(contact4);
        lstContact.add(contact5);

//        recyclerViewAdapter = new RecyclerViewAdapter(getActivity(),lstContact);
//        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        myrecyclerView.setAdapter(recyclerViewAdapter);

        recyclerViewAdapter = new RecyclerViewAdapter(this,lstContact);
        javaLista.setLayoutManager(new LinearLayoutManager(this));
        javaLista.setAdapter(recyclerViewAdapter);

    }
}
