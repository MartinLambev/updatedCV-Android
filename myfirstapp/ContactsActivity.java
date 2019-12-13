package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ContactsActivity extends AppCompatActivity {
    ImageButton home;
    ImageButton person;
    ImageButton education;
    ImageButton experience;
    ImageButton skills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        getSupportActionBar().hide();

        this.home = findViewById(R.id.home);
        this.home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadHomeActivity = new Intent(ContactsActivity.this, MainActivity.class);
                startActivity(intentLoadHomeActivity);
            }
        });

        this.person = findViewById(R.id.person);
        this.person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadPersonActivity = new Intent(ContactsActivity.this, PersonActivity.class);
                startActivity(intentLoadPersonActivity);
            }
        });

        this.education = findViewById(R.id.education);
        this.education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadEducationActivity = new Intent(ContactsActivity.this, EducationActivity.class);
                startActivity(intentLoadEducationActivity);
            }
        });

        this.experience = findViewById(R.id.experience);
        this.experience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadExperienceActivity = new Intent(ContactsActivity.this, ExperienceActivity.class);
                startActivity(intentLoadExperienceActivity);
            }
        });

        this.skills = findViewById(R.id.skills);
        this.skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadSkillsActivity = new Intent(ContactsActivity.this, SkillsActivity.class);
                startActivity(intentLoadSkillsActivity);
            }
        });


    }
}
