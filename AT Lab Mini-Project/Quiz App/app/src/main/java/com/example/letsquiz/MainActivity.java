package com.example.letsquiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static androidx.appcompat.app.AlertDialog.*;

public class MainActivity extends AppCompatActivity {

    private TextView optionA, optionB,optionC,optionD;
    private TextView questionnumber,question,score;
    private TextView checkout1, checkout2;
    int currentindex;
    int scorecount=0;
    int qn=1;
    ProgressBar progressBar;
    final int PROGRESS_BAR= (int) Math.ceil(100/7);
    int CurrentQuestion,CurrentOptionA,CurrentOptionB,CurrentOptionC,CurrentOptionD;
    Random ran=new Random();
    int[] prevvals =new int[7];

    private QAClass[] questionbank=new QAClass[]
            {
                    new QAClass(R.string.question1,R.string.question1_A,R.string.question1_B,R.string.question1_C,R.string.question1_D,R.string.answer1),
                    new QAClass(R.string.question2,R.string.question2_A,R.string.question2_B,R.string.question2_C,R.string.question2_D,R.string.answer2),
                    new QAClass(R.string.question3,R.string.question3_A,R.string.question3_B,R.string.question3_C,R.string.question3_D,R.string.answer3),
                    new QAClass(R.string.question4,R.string.question4_A,R.string.question4_B,R.string.question4_C,R.string.question4_D,R.string.answer4),
                    new QAClass(R.string.question5,R.string.question5_A,R.string.question5_B,R.string.question5_C,R.string.question5_D,R.string.answer5),
                    new QAClass(R.string.question6,R.string.question6_A,R.string.question6_B,R.string.question6_C,R.string.question6_D,R.string.answer6),
                    new QAClass(R.string.question7,R.string.question7_A,R.string.question7_B,R.string.question7_C,R.string.question7_D,R.string.answer7),
                    new QAClass(R.string.question8,R.string.question8_A,R.string.question8_B,R.string.question8_C,R.string.question8_D,R.string.answer8),
                    new QAClass(R.string.question9,R.string.question9_A,R.string.question9_B,R.string.question9_C,R.string.question9_D,R.string.answer9),
                    new QAClass(R.string.question10,R.string.question10_A,R.string.question10_B,R.string.question10_C,R.string.question10_D,R.string.answer10),
                    new QAClass(R.string.question11,R.string.question11_A,R.string.question11_B,R.string.question11_C,R.string.question11_D,R.string.answer11),
                    new QAClass(R.string.question12,R.string.question12_A,R.string.question12_B,R.string.question12_C,R.string.question12_D,R.string.answer12),
                    new QAClass(R.string.question13,R.string.question13_A,R.string.question13_B,R.string.question13_C,R.string.question13_D,R.string.answer13),
                    new QAClass(R.string.question14,R.string.question14_A,R.string.question14_B,R.string.question14_C,R.string.question14_D,R.string.answer14),
                    new QAClass(R.string.question15,R.string.question15_A,R.string.question15_B,R.string.question15_C,R.string.question15_D,R.string.answer15),
                    new QAClass(R.string.question16,R.string.question16_A,R.string.question16_B,R.string.question16_C,R.string.question16_D,R.string.answer16),
                    new QAClass(R.string.question17,R.string.question17_A,R.string.question17_B,R.string.question17_C,R.string.question17_D,R.string.answer17),
                    new QAClass(R.string.question18,R.string.question18_A,R.string.question18_B,R.string.question18_C,R.string.question18_D,R.string.answer18),
                    new QAClass(R.string.question19,R.string.question19_A,R.string.question19_B,R.string.question19_C,R.string.question19_D,R.string.answer19),
                    new QAClass(R.string.question20,R.string.question20_A,R.string.question20_B,R.string.question20_C,R.string.question20_D,R.string.answer20)
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        optionA=findViewById(R.id.OptionA);
        optionB=findViewById(R.id.OptionB);
        optionC=findViewById(R.id.OptionC);
        optionD=findViewById(R.id.OptionD);
        question=findViewById(R.id.question);
        score=findViewById(R.id.Scorecard);
        questionnumber=findViewById(R.id.QuestionNumber);
        checkout1=findViewById(R.id.selectedoption);
        checkout2=findViewById(R.id.CorrectAnswer);
        progressBar=findViewById(R.id.progress_bar);


        currentindex= ran.nextInt(20);
        prevvals[qn-1]=currentindex;

        CurrentQuestion=questionbank[currentindex].getQuestionid();
        question.setText(CurrentQuestion);
        CurrentOptionA=questionbank[currentindex].getOptionA();
        optionA.setText(CurrentOptionA);
        CurrentOptionB=questionbank[currentindex].getOptionB();
        optionB.setText(CurrentOptionB);
        CurrentOptionC=questionbank[currentindex].getOptionC();
        optionC.setText(CurrentOptionC);
        CurrentOptionD=questionbank[currentindex].getOptionD();
        optionD.setText(CurrentOptionD);

        optionA.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                   checkAnswer(CurrentOptionA);
                   updateQuestion();
            }
        }
        );
        optionB.setOnClickListener(new View.OnClickListener()
                                   {
                                       @Override
                                       public void onClick(View v) {
                                           checkAnswer(CurrentOptionB);
                                           updateQuestion();
                                       }
                                   }
        );
        optionC.setOnClickListener(new View.OnClickListener()
                                   {
                                       @Override
                                       public void onClick(View v) {
                                           checkAnswer(CurrentOptionC);
                                           updateQuestion();
                                       }
                                   }
        );
        optionD.setOnClickListener(new View.OnClickListener()
                                   {
                                       @Override
                                       public void onClick(View v) {
                                           checkAnswer(CurrentOptionD);
                                           updateQuestion();
                                       }
                                   }
        );



    }

    private void checkAnswer(int userselection)
    {
        int correctanswer=questionbank[currentindex].getAnswerid();
        checkout1.setText(userselection);
        checkout2.setText(correctanswer);
        String m=checkout1.getText().toString().trim();
        String n=checkout2.getText().toString().trim();
        if(m.equalsIgnoreCase(n))
        {
            Toast.makeText(getApplicationContext(),"Right Answer",Toast.LENGTH_SHORT).show();
            scorecount+=1;
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_SHORT).show();
        }

    }

    @SuppressLint("SetTextI18n")
    private void updateQuestion()
    {
        if(qn>7)
        {
            AlertDialog.Builder alert=new AlertDialog.Builder(this);
            alert.setTitle("Game Over");
            alert.setCancelable(false);
            alert.setMessage("Your Score is "+ scorecount+" points");
            alert.setPositiveButton("Close Application", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            alert.setNegativeButton("NO",new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    scorecount=0;
                    qn=1;
                    progressBar.setProgress(0);
                    score.setText("Score "+scorecount+"/"+7);
                    questionnumber.setText(qn+"/"+7+"Question");
                }
            });
        }
        int newindex,flag;
        do {
            flag=0;
            newindex = ran.nextInt(20);
            for (int i = 0; i < qn; i++) {
                if (newindex == prevvals[i]) {
                    flag += 1;
                    break;
                }
            }
        }while(flag!=0);
        currentindex=newindex;

        CurrentQuestion=questionbank[currentindex].getQuestionid();
        question.setText(CurrentQuestion);
        CurrentOptionA=questionbank[currentindex].getOptionA();
        optionA.setText(CurrentOptionA);
        CurrentOptionB=questionbank[currentindex].getOptionB();
        optionB.setText(CurrentOptionB);
        CurrentOptionC=questionbank[currentindex].getOptionC();
        optionC.setText(CurrentOptionC);
        CurrentOptionD=questionbank[currentindex].getOptionD();
        optionD.setText(CurrentOptionD);

        qn+=1;
        prevvals[qn-1]=currentindex;
        if(qn<=7)
        {
            questionnumber.setText(qn+"/"+7+"Question");
        }
        score.setText("Score "+scorecount+"/"+7);
        progressBar.incrementProgressBy(PROGRESS_BAR);

    }
}