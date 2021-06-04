package com.example.letsquiz;

public class QAClass
{
    private int optionA,optionB,optionC,optionD,questionid,answerid;
    public QAClass(int questionide,int optiona,int optionb,int optionc,int optiond, int answeride)
    {
        questionid=questionide;
        optionA=optiona;
        optionB=optionb;
        optionC=optionc;
        optionD=optiond;
        answerid=answeride;
    }

    public int getQuestionid() {
        return questionid;
    }

    public int getOptionA() {
        return optionA;
    }

    public int getOptionB() {
        return optionB;
    }

    public int getOptionC() {
        return optionC;
    }

    public int getOptionD() {
        return optionD;
    }
    public int getAnswerid() {
        return answerid;
    }
}
