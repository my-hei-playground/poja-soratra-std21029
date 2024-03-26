package hei.school.soratra.repository;

import hei.school.soratra.repository.model.Taratasy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaratasyRepository extends JpaRepository<Taratasy, String> {
}
