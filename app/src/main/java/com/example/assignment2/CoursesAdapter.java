package com.example.assignment2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.CourseItemViewHolder> {
    private ArrayList<CourseItem> coursesList;
    private onCourseClickListener courseClickListener;
    public CoursesAdapter(ArrayList<CourseItem> coursesList, onCourseClickListener courseClickListener){
        this.coursesList= coursesList;
        this.courseClickListener = courseClickListener;
    }


    @NonNull
    @Override
    public CourseItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_course , parent , false);
        return new CourseItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseItemViewHolder holder, int position) {
        CourseItem item = coursesList.get(position);
        holder.courseImage.setImageResource(item.getImageId());
        holder.courseButton.setText(item.getButtonText());
        holder.courseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(courseClickListener!=null){
                    courseClickListener.onCourseClick(position);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        if(coursesList==null)
            return 0;
        else
            return coursesList.size();
    }

    class CourseItemViewHolder extends RecyclerView.ViewHolder{
        ImageView courseImage;
        Button courseButton;

        public CourseItemViewHolder(@NonNull View itemView) {
            super(itemView);
            courseImage = itemView.findViewById(R.id.course_image);
            courseButton = itemView.findViewById(R.id.course_button);

        }
    }
}
