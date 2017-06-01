package com.mei_husky.samplemvvm.model.api;

import com.mei_husky.samplemvvm.common.Constants;
import com.mei_husky.samplemvvm.model.MovieInfoModel;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by fcn-mq on 2017/6/1.
 */

public interface MovieService {

    /**
     * {
     * "rating": {
     * "max": 10,
     * "average": 7.4,
     * "stars": "40",
     * "min": 0
     * },
     * "reviews_count": 295,
     * "wish_count": 15213,
     * "douban_site": "",
     * "year": "2009",
     * "images": {
     * "small": "https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p494268647.jpg",
     * "large": "https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p494268647.jpg",
     * "medium": "https://img1.doubanio.com/view/movie_poster_cover/spst/public/p494268647.jpg"
     * }
     *
     * @param movieId 电影ID  测试用：25937854
     * @return
     */
    @GET(Constants.API.DOUBAN_MOVIE_INFO + "/{id}")
    Observable<MovieInfoModel> getMovieInfo(@Path("id") String movieId);

}
