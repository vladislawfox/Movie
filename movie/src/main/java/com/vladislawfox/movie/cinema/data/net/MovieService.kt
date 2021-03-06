package com.vladislawfox.movie.cinema.data.net

import com.vladislawfox.movie.cinema.data.net.response.MoviesResponse
import retrofit2.Call
import retrofit2.Retrofit
import javax.inject.Inject

/**
 * Created by vladislawfox on 2/4/19.
 */
class MovieService @Inject constructor(retrofit: Retrofit) : MovieApi {
  private val movieApi by lazy { retrofit.create(MovieApi::class.java) }

  override fun getPopularMovie(page: Int,
      language: String): Call<MoviesResponse> = movieApi.getPopularMovie(page, language)

  override fun getTopMovie(page: Int,
      language: String): Call<MoviesResponse> = movieApi.getTopMovie(page, language)

  override fun getNowPlayingMovie(page: Int,
      language: String): Call<MoviesResponse> = movieApi.getNowPlayingMovie(page, language)

  override fun getUpcomingMovie(page: Int,
      language: String): Call<MoviesResponse> = movieApi.getUpcomingMovie(page, language)
}