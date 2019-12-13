package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ExperienceActivity extends AppCompatActivity {
    ImageButton home;
    ImageButton person;
    ImageButton education;
    ImageButton skills;
    ImageButton contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);
        getSupportActionBar().hide();

        this.home = findViewById(R.id.home);
        this.home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadHomeActivity = new Intent(ExperienceActivity.this, MainActivity.class);
                startActivity(intentLoadHomeActivity);
            }
        });

        this.person = findViewById(R.id.person);
        this.person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadPersonActivity = new Intent(ExperienceActivity.this, PersonActivity.class);
                startActivity(intentLoadPersonActivity);
            }
        });

        this.education = findViewById(R.id.education);
        this.education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadEducationActivity = new Intent(ExperienceActivity.this, EducationActivity.class);
                startActivity(intentLoadEducationActivity);
            }
        });

        this.skills = findViewById(R.id.skills);
        this.skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadSkillsActivity = new Intent(ExperienceActivity.this, SkillsActivity.class);
                startActivity(intentLoadSkillsActivity);
            }
        });

        this.contacts = findViewById(R.id.contacts);
        this.contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadContactsActivity = new Intent(ExperienceActivity.this, ContactsActivity.class);
                startActivity(intentLoadContactsActivity);
            }
        });

    }
}
