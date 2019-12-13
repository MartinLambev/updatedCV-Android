package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PersonActivity extends AppCompatActivity {
    ImageButton home;
    ImageButton experience;
    ImageButton education;
    ImageButton skills;
    ImageButton contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        getSupportActionBar().hide();

        this.home = findViewById(R.id.home);
        this.home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadHomeActivity = new Intent(PersonActivity.this, MainActivity.class);
                startActivity(intentLoadHomeActivity);
            }
        });

        this.education = findViewById(R.id.education);
        this.education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadEducationActivity = new Intent(PersonActivity.this, EducationActivity.class);
                startActivity(intentLoadEducationActivity);
            }
        });

        this.experience = findViewById(R.id.experience);
        this.experience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadExperienceActivity = new Intent(PersonActivity.this, ExperienceActivity.class);
                startActivity(intentLoadExperienceActivity);
            }
        });

        this.skills = findViewById(R.id.skills);
        this.skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadSkillsActivity = new Intent(PersonActivity.this, SkillsActivity.class);
                startActivity(intentLoadSkillsActivity);
            }
        });

        this.contacts = findViewById(R.id.contacts);
        this.contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadContactsActivity = new Intent(PersonActivity.this, ContactsActivity.class);
                startActivity(intentLoadContactsActivity);
            }
        });
    }
}
