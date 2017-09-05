/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ChanhPM
 */
public class Question {

    private String ques, ansA, ansB, ansC, ansD, trueAns;

    public Question() {

    }

    public Question(String ques, String ansA, String ansB, String ansC, String ansD, String ansTrue) {
        this.ques = ques;
        this.ansA = ansA;
        this.ansB = ansB;
        this.ansC = ansC;
        this.ansD = ansD;
        this.trueAns = ansTrue;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public String getAnsA() {
        return ansA;
    }

    public void setAnsA(String ansA) {
        this.ansA = ansA;
    }

    public String getAnsB() {
        return ansB;
    }

    public void setAnsB(String ansB) {
        this.ansB = ansB;
    }

    public String getAnsC() {
        return ansC;
    }

    public void setAnsC(String ansC) {
        this.ansC = ansC;
    }

    public String getAnsD() {
        return ansD;
    }

    public void setAnsD(String ansD) {
        this.ansD = ansD;
    }

    public String getTrueAns() {
        return trueAns;
    }

    public void setAnsTrue(String ansTrue) {
        this.trueAns = ansTrue;
    }

    @Override
    public String toString() {
        return "Question{" + "ques=" + ques + ", ansA=" + ansA + ", ansB=" + ansB + ", ansC=" + ansC + ", ansD=" + ansD + ", ansTrue=" + trueAns + '}';
    }
}
