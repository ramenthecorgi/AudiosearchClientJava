package aj.canvas.audiosearch.service;

import java.util.List;

import aj.canvas.audiosearch.model.TrendResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AudiosearchService {
    @GET("tastemakers/episodes/{n}")
    Call<List<Object>> getTastemakersEpisodes(@Path("n") int n);

    @GET("/tastemakers/episodes/source/{taskmakerId}/{n}")
    Call<List<Object>> getEpisodesByTaskmaker(@Path("tastemakerId") String tastemakerId, @Path("n") int n);

    @GET("episodes/{id}")
    Call<Object> getEpisode(@Path("id") long id);

    @GET("search/episodes/{query}")
    Call<List<Object>> getEpisodeList(@Path("query") String query);

    @GET("episodes/{id}/related")
    Call<List<Object>> getRelatedEpisodes(@Path("id") long id);

    @GET("episodes/{id}/snippet/{timestamp}")
    Call<Object> getEpisodeMoment(@Path("id") long id, @Path("timestamp") long timestamp);

    @GET("trending")
    Call<List<TrendResult>> getTrending();

    @GET("tastemakers/shows/{n}")
    Call<List<Object>> getShowsbyTastemakers(@Path("n") int n);

    @GET("shows/{id}")
    Call<Object> getShow(@Path("id") long id);

    @GET("shows/{id}/related")
    Call<List<Object>> getRelatedShows(@Path("id") long id);

    @GET("search/shows/{query}")
    Call<List<Object>> getShowList(@Path("query") String query);

    @GET("people/{id}")
    Call<Object> getPerson(@Path("id") long id);

    @GET("search/people/{query}")
    Call<List<Object>> getPeople(@Path("query") String query);

    @GET("chart_daily")
    Call<List<Object>> getDailyChart();

}