package reto.bcp.user.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import reto.bcp.user.model.Review;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {
}
