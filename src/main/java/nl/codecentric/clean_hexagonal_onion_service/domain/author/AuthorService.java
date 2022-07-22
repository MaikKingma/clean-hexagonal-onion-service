package nl.codecentric.clean_hexagonal_onion_service.domain.author;

import java.util.List;

/**
 * @author Maik Kingma
 */

public interface AuthorService {
    void registerAuthor(Author author);

    List<Author> findAll();
}
