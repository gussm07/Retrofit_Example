package edu.ieu.retrofitexample.interfaces;


import java.util.List;

import edu.ieu.retrofitexample.modelo.Post;
import retrofit2.Call;
import retrofit2.http.GET;

public abstract class PostService {
    String API_ROUTE = "/posts";

    @GET
    Call<List<Post>> getPost() {
        return null;
    }

}
