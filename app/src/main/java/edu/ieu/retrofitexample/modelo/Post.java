package edu.ieu.retrofitexample.modelo;

public class Post {
    private int Userid;
    private int id;
    private String title;
    private String body;

    public Post(int userid) {
        Userid = userid;
    }

    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        Userid = userid;
    }
}
