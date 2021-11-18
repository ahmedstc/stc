package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import com.querydsl.jpa.JPQLQuery;
import org.springframework.stereotype.Repository;
import sa.com.stc.common.repositories.IBaseCustomRepositoryImpl;
import sa.com.stc.vms.backend.filters.SupplierSettingFilter;
import sa.com.stc.vms.backend.filters.SupplierSettingFilter;
import sa.com.stc.vms.backend.models.QSupplierSetting;
import sa.com.stc.vms.backend.models.SupplierSetting;
import sa.com.stc.vms.backend.models.QSupplierSetting;
import sa.com.stc.vms.backend.models.SupplierSetting;

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

    @Override
    public <E> JPQLQuery<E> queryForFilter(EntityPath<? extends SupplierSetting> pathToEntity, JPQLQuery<E> query,
                                           SupplierSettingFilter filter) {
        var result = super.queryForFilter(pathToEntity, query, filter);
        var entityPath = new QSupplierSetting(pathToEntity.toString());

        if (filter.getNameAR() != null) {
            result = result.where(entityPath.nameAr.eq(filter.getNameAR()));
        }
        if (filter.getNameEN() != null) {
            result = result.where(entityPath.nameAr.eq(filter.getNameAR()));
        }
        if (filter.getSupplierSettingTypeLookupId() != null) {
            result = result.where(entityPath.supplierSettingTypeLookupId.eq(filter.getSupplierSettingTypeLookupId()));
        }
        if (filter.getProjectManager() != null) {
            result = result.where(entityPath.projectManager.eq(filter.getProjectManager()));
        }
        if (filter.getEmail() != null) {
            result = result.where(entityPath.email.eq(filter.getEmail()));
        }
        if (filter.getMobileNumber() != null) {
            result = result.where(entityPath.mobileNumber.eq(filter.getMobileNumber()));
        }
        return result;
    }
}
