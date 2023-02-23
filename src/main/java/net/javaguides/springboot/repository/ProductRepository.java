package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
@Repository
public interface ProductRepository extends JpaRepository<product,Long> {

    @Query(value = "SELECT * from products p where p.id= ?1", nativeQuery = true)
    public String productName(Long id);

}
