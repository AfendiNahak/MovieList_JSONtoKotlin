package afendin490.gmail.com.movielist_jsontokotlin

import io.reactivex.Observable
import retrofit2.http.GET

interface ApiMovies {

// mengambil data json melalui URL
    @GET("/filippella/Sample-API-Files/master/json/movies-api.json")
    fun getMovies() : Observable<MovieResponse>
}