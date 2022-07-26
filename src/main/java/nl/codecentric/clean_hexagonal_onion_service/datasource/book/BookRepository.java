package nl.codecentric.clean_hexagonal_onion_service.datasource.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Maik Kingma
 */

@Repository
public interface BookRepository extends JpaRepository<BookJPA, Long> {

    List<BookJPA> findByTitleContains(String title);
}
