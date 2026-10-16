package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.BookUuid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookUuidRepository extends JpaRepository<BookUuid, Long> {

}
