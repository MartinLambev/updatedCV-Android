package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SkillsActivity extends AppCompatActivity {
    ImageButton home;
    ImageButton person;
    ImageButton experience;
    ImageButton education;
    ImageButton contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);
        getSupportActionBar().hide();

        this.home = findViewById(R.id.home);
        this.home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadHomeActivity = new Intent(SkillsActivity.this, MainActivity.class);
                startActivity(intentLoadHomeActivity);
            }
        });

        this.person = findViewById(R.id.person);
        this.person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadPersonActivity = new Intent(SkillsActivity.this, PersonActivity.class);
                startActivity(intentLoadPersonActivity);
            }
        });

        this.education = findViewById(R.id.education);
        this.education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadEducationActivity = new Intent(SkillsActivity.this, EducationActivity.class);
                startActivity(intentLoadEducationActivity);
            }
        });

        this.experience = findViewById(R.id.experience);
        this.experience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadExperienceActivity = new Intent(SkillsActivity.this, ExperienceActivity.class);
                startActivity(intentLoadExperienceActivity);
            }
        });

        this.contacts = findViewById(R.id.contacts);
        this.contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadContactsActivity = new Intent(SkillsActivity.this, ContactsActivity.class);
                startActivity(intentLoadContactsActivity);
            }
        });
    }
}
