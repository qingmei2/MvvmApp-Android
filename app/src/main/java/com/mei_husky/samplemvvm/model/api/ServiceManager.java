package com.mei_husky.samplemvvm.model.api;

import com.mei_husky.samplemvvm.common.Constants;
import com.mei_husky.samplemvvm.model.MovieInfoModel;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Created by fcn-mq on 2017/6/1.
 */

public class ServiceManager {

    MovieService movieService;

    public ServiceManager() {
        init();
    }

    private void init() {

        OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
        if (Constants.DEBUG) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            builder.addInterceptor(interceptor);
        }
        OkHttpClient client = builder.build();

        movieService = new Retrofit.Builder()
                .baseUrl(Constants.API.BASE_DOUBAN)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build()
                .create(MovieService.class);
    }

    public Observable<MovieInfoModel> getMovieInfoTest() {
        return getMovieInfo(String.valueOf(25937854));
    }

    /**
     * 获得对应电影ID的电影信息
     *
     * @param movieId
     * @return
     */
    public Observable<MovieInfoModel> getMovieInfo(String movieId) {
        return movieService.getMovieInfo(movieId);
    }
}
