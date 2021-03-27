package com.labeeb.examapp.live_exam_recyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;
import com.labeeb.examapp.R;

import java.util.List;

 public class live_exam_Adapter extends RecyclerView.Adapter<live_exam_Adapter.ViewHolder> {

    Context context;

    List<live_exam_Model> liveexam_material_cardView;


    public live_exam_Adapter(Context context, List<live_exam_Model> list){

        this.context = context;
        this.liveexam_material_cardView = list;

    }

    @NonNull
    @Override
    public live_exam_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_live_exam, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("ResourceType")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

//
//        holder.SSCExam_2020.setText(liveexam_material_cardView.get(position).getSSCExam_2020());
//        holder.Examiner_Details.setText(liveexam_material_cardView.get(position).getExaminer_Details());
//        holder.textViewEntry.setText(liveexam_material_cardView.get(position).getTextViewEntry());
//        holder.Entry_Prize.setText(liveexam_material_cardView.get(position).getEntry_Prize());
//        holder.Time_in_LiveExam_recycler.setText(liveexam_material_cardView.get(position).getTime_in_LiveExam_recycler());
//        holder.Date_in_LiveExam_recyclerView.setText(liveexam_material_cardView.get(position).getDate_in_LiveExam_recyclerView());
//        holder.LiveTextView.setText(liveexam_material_cardView.get(position).getLiveTextView());
//        holder.startQuiz_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, "Start Quiz Now", Toast.LENGTH_SHORT).show();
//            }
//        });
//        holder.viewDetails_Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, "View Quiz Details", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        holder.liveExam_recyclerview_image.setImageDrawable(context.getResources().getDrawable(R.id.liveExam_recyclerview_image));

    }


    @Override
    public int getItemCount() {
        return 10;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        MaterialCardView LiveExam_MaterialcCardView,materialCardView_Give_and_win;
        ConstraintLayout constraintLayoutblue;
        TextView SSCExam_2020,Examiner_Details,textViewEntry,Entry_Prize,textViewGive_and_win,textViewLakh,Time_in_LiveExam_recycler,Date_in_LiveExam_recyclerView,LiveTextView;
        Button startQuiz_button, viewDetails_Button;
        ImageView liveExam_recyclerview_image, imageViewgreendot1,imageViewgreendot2,Clock_image,imageViewcup,imageViewdollar,imageViewdollar2;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            LiveExam_MaterialcCardView = itemView.findViewById(R.id.LiveExam_MaterialcCardViewnew1);
            materialCardView_Give_and_win = itemView.findViewById(R.id.materialCardView_Give_and_win);
            constraintLayoutblue = itemView.findViewById(R.id.constraintLayoutblue);
            SSCExam_2020 = itemView.findViewById(R.id.SSCExam_2020);
            Examiner_Details = itemView.findViewById(R.id.Examiner_Details);
            textViewEntry = itemView.findViewById(R.id.textViewEntry);
            Time_in_LiveExam_recycler = itemView.findViewById(R.id.Time_in_LiveExam_recycler);
            Date_in_LiveExam_recyclerView = itemView.findViewById(R.id.Date_in_LiveExam_recyclerView);
            LiveTextView = itemView.findViewById(R.id.LiveTextView);
            startQuiz_button = itemView.findViewById(R.id.startQuiz_button);
            viewDetails_Button = itemView.findViewById(R.id.viewDetails_Button);
            liveExam_recyclerview_image = itemView.findViewById(R.id.liveExam_recyclerview_image);
            Entry_Prize = itemView.findViewById(R.id.Entry_Prize);




        }
    }
}
