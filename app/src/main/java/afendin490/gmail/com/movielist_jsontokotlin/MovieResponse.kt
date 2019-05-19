package afendin490.gmail.com.movielist_jsontokotlin

class MovieResponse {
    //keyword lateinit, untuk memberitahu bahwa variable ini nantinya akan
    // diinisialisasi sehingga variabel tersebut tidak akan null
    lateinit var data : List<Movie>
}