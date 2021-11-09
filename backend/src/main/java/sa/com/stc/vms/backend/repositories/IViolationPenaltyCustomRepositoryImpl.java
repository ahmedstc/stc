package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import org.springframework.stereotype.Repository;
import sa.com.stc.common.repositories.IBaseCustomRepositoryImpl;
import sa.com.stc.vms.backend.filters.ViolationPenaltyFilter;
import sa.com.stc.vms.backend.models.QViolationPenalty;
import sa.com.stc.vms.backend.models.ViolationPenalty;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class IViolationPenaltyCustomRepositoryImpl extends IBaseCustomRepositoryImpl<ViolationPenalty, ViolationPenaltyFilter>
        implements IViolationPenaltyCustomRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public EntityPath<ViolationPenalty> getEntityPath() {
        return QViolationPenalty.violationPenalty;
    }

    @Override
    public EntityManager getEntityManager() {
        return this.em;
    }

    @Override
    public ViolationPenaltyFilter getFilterInstance() {
        return new ViolationPenaltyFilter();
    }
}
