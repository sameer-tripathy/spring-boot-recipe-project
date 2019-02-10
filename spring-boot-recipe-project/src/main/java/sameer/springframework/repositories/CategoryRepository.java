package sameer.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sameer.springframework.domain.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
