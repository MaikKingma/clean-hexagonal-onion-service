package nl.codecentric.clean_hexagonal_onion_service.datasource.author;

import nl.codecentric.clean_hexagonal_onion_service.domain.author.Author;

/**
 * @author Maik Kingma
 */

public class AuthorMapper {

    public static AuthorJPA mapToJPA(Author author) {
        return AuthorJPA.builder()
                .id(author.getId())
                .firstName(author.getFirstName())
                .lastName(author.getLastName())
                .build();
    }

    public static Author mapToDomain(AuthorJPA authorJPA) {
        return Author.builder()
                .id(authorJPA.getId())
                .firstName(authorJPA.getFirstName())
                .lastName(authorJPA.getLastName())
                .build();
    }
}
