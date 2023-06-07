package io.github.fgabrielbraga.exerciciossb.model.repositories;

import io.github.fgabrielbraga.exerciciossb.model.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {
    public Iterable<Product> findByNameContainingIgnoreCase(String name);

    @Query("select p from Product p where p.name like %:name%")
    public Iterable<Product> searchByNameLike(@Param("name") String name);
}
