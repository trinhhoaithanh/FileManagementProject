package filemanagement.filemanagement.repository;

import filemanagement.filemanagement.domain.Group;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class GroupRepository {
    @PersistenceContext
    private EntityManager em;

    public void saveGroup(Group group){
        em.persist(group);
    }
}
