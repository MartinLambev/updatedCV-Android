package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    ImageButton person;
    ImageButton experience;
    ImageButton education;
    ImageButton skills;
    ImageButton contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        this.person = findViewById(R.id.person);
        this.person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadPersonActivity = new Intent(MainActivity.this, PersonActivity.class);
                startActivity(intentLoadPersonActivity);
            }
        });

        this.education = findViewById(R.id.education);
        this.education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadEducationActivity = new Intent(MainActivity.this, EducationActivity.class);
                startActivity(intentLoadEducationActivity);
            }
        });

        this.experience = findViewById(R.id.experience);
        this.experience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadExperienceActivity = new Intent(MainActivity.this, ExperienceActivity.class);
                startActivity(intentLoadExperienceActivity);
            }
        });

        this.skills = findViewById(R.id.skills);
        this.skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadSkillsActivity = new Intent(MainActivity.this, SkillsActivity.class);
                startActivity(intentLoadSkillsActivity);
            }
        });

        this.contacts = findViewById(R.id.contacts);
        this.contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadContactsActivity = new Intent(MainActivity.this, ContactsActivity.class);
                startActivity(intentLoadContactsActivity);
            }
        });
    }
}
