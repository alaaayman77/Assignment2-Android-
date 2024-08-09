package com.example.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CoursesActivity extends AppCompatActivity implements onCourseClickListener {
    RecyclerView coursesRecyclerView;
    CoursesAdapter adapter;
    ArrayList<CourseItem> coursesList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        coursesRecyclerView = findViewById(R.id.courses_recycler_view);
        createList();
        adapter =  new CoursesAdapter(coursesList , this);
        coursesRecyclerView.setAdapter(adapter);


    }
    public void createList(){
        coursesList = new ArrayList<>();
        coursesList.add(new CourseItem(R.drawable.android_img , "Android Course"));
        coursesList.add(new CourseItem(R.drawable.full_stack_img , "Full Stack Course"));
        coursesList.add(new CourseItem(R.drawable.ios_img , "IOS Course"));
        }


    @Override
    public void onCourseClick(int position) {
        CourseItem clickedButton = coursesList.get(position);
        if(clickedButton.getButtonText().equals("Android Course")){
            Intent intent = new Intent(this, Course_DetailsActivity.class);
            intent.putExtra("key", "value1"); // Pass data with the intent
            startActivity(intent);

        }
        else if (clickedButton.getButtonText().equals("Full Stack Course")) {
            Intent intent = new Intent(this, Course_DetailsActivity.class);
            intent.putExtra("key", "value2"); // Pass data with the intent
            startActivity(intent);

        }
        else if (clickedButton.getButtonText().equals("IOS Course")) {
            Intent intent = new Intent(this, Course_DetailsActivity.class);
            intent.putExtra("key", "value3"); // Pass data with the intent
            startActivity(intent);

        }



    }
}