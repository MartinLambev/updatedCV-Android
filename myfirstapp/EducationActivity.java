package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class EducationActivity extends AppCompatActivity {
    ImageButton home;
    ImageButton person;
    ImageButton experience;
    ImageButton skills;
    ImageButton contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        getSupportActionBar().hide();

        this.home = findViewById(R.id.home);
        this.home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadHomeActivity = new Intent(EducationActivity.this, MainActivity.class);
                startActivity(intentLoadHomeActivity);
            }
        });

        this.person = findViewById(R.id.person);
        this.person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadPersonActivity = new Intent(EducationActivity.this, PersonActivity.class);
                startActivity(intentLoadPersonActivity);
            }
        });


        this.experience = findViewById(R.id.experience);
        this.experience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadExperienceActivity = new Intent(EducationActivity.this, ExperienceActivity.class);
                startActivity(intentLoadExperienceActivity);
            }
        });

        this.skills = findViewById(R.id.skills);
        this.skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadSkillsActivity = new Intent(EducationActivity.this, SkillsActivity.class);
                startActivity(intentLoadSkillsActivity);
            }
        });

        this.contacts = findViewById(R.id.contacts);
        this.contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadContactsActivity = new Intent(EducationActivity.this, ContactsActivity.class);
                startActivity(intentLoadContactsActivity);
            }
        });
    }
}
