package reto.bcp.user.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import reto.bcp.user.model.Item;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

   //List<Item> findItemsWithAverageRatingLowerThan(Double rating);
  List<Item> findByItems_RatingGreaterThan(Double rating);

}
