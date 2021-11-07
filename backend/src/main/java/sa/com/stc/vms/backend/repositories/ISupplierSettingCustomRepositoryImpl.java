package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import org.springframework.stereotype.Repository;
import sa.com.stc.common.repositories.IBaseCustomRepositoryImpl;
import sa.com.stc.vms.backend.filters.SupplierSettingFilter;
import sa.com.stc.vms.backend.models.SupplierSetting;
import sa.com.stc.vms.backend.models.QSupplierSetting;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ISupplierSettingCustomRepositoryImpl extends IBaseCustomRepositoryImpl<SupplierSetting, SupplierSettingFilter>
        implements ISupplierSettingCustomRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public EntityPath<SupplierSetting> getEntityPath() {
        return QSupplierSetting.supplierSetting;
    }

    @Override
    public EntityManager getEntityManager() {
        return this.em;
    }

    @Override
    public SupplierSettingFilter getFilterInstance() {
        return new SupplierSettingFilter();
    }
}
