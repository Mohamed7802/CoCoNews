package com.demo7802.coconews.Interface;


import com.demo7802.coconews.Common.Common;
import com.demo7802.coconews.Model.News;
import com.demo7802.coconews.Model.WebSite;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;


public interface NewsService {
    @GET("v2/sources?language=en&apiKey="+ Common.API_KEY)
    Call<WebSite> getSources();

    @GET
    Call<News> getNewestArticles(@Url String url);
}
