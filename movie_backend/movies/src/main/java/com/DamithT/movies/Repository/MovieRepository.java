package com.DamithT.movies.Repository;

import com.DamithT.movies.Model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId > {
    Optional<Movie> findMovieByImdbId(String imdbId);
}
