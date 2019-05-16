package com.demo7802.coconews.Common;


import com.demo7802.coconews.Interface.IconBetterIdeaService;
import com.demo7802.coconews.Interface.NewsService;
import com.demo7802.coconews.Remote.IconBetterIdeaClient;
import com.demo7802.coconews.Remote.RetrofitClient;



public class Common {
    private static final String BASE_URL="https://newsapi.org/";

    public  static final String API_KEY="f6e565724c9846e5ae65a77b0e6af453";

    public static NewsService getNewsService()
    {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService()
    {
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }

    //https://newsapi.org/v1/articles?source=the-next-web&sortBy=latest&apiKey=a7072d9c2ad9495a8dd5cb58a7fd30df
    public static String getAPIUrl(String source,String sortBy,String apiKEY)
    {
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v2/top-headlines?sources=");
        return apiUrl.append(source)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();
    }


}
