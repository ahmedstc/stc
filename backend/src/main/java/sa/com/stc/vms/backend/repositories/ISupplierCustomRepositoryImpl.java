package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import org.springframework.stereotype.Repository;
import sa.com.stc.common.repositories.IBaseCustomRepositoryImpl;
import sa.com.stc.vms.backend.filters.SupplierFilter;
import sa.com.stc.vms.backend.models.Supplier;
import sa.com.stc.vms.backend.models.QSupplier;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ISupplierCustomRepositoryImpl extends IBaseCustomRepositoryImpl<Supplier, SupplierFilter>
        implements ISupplierCustomRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public EntityPath<Supplier> getEntityPath() {
        return QSupplier.supplier;
    }

    @Override
    public EntityManager getEntityManager() {
        return this.em;
    }

    @Override
    public SupplierFilter getFilterInstance() {
        return new SupplierFilter();
    }
}
