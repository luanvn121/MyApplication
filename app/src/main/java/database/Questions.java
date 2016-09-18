package database;

/**
 * Created by Admin on 9/15/2016.
 */
public class Questions {
    private String question_id;
    private String question;
    private String a;
    private String b;
    private String c;
    private String d;
    private String kqua;

    public Questions(String question_id, String question, String a, String b, String c, String d, String kqua) {
        this.question_id = question_id;
        this.question = question;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.kqua = kqua;
    }

    public Questions(String s, String s1, String s2, String s3, String s4, String s5) {
    }

    public String getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(String question_id) {
        this.question_id = question_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getKqua() {
        return kqua;
    }

    public void setKqua(String kqua) {
        this.kqua = kqua;
    }

}
