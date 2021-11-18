package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import com.querydsl.jpa.JPQLQuery;
import org.springframework.stereotype.Repository;
import sa.com.stc.common.repositories.IBaseCustomRepositoryImpl;
import sa.com.stc.vms.backend.filters.AlertSettingFilter;
import sa.com.stc.vms.backend.models.AlertSetting;
import sa.com.stc.vms.backend.models.QAlertSetting;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class IAlertSettingCustomRepositoryImpl extends IBaseCustomRepositoryImpl<AlertSetting, AlertSettingFilter>
        implements IAlertSettingCustomRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public EntityPath<AlertSetting> getEntityPath() {
        return QAlertSetting.alertSetting;
    }

    @Override
    public EntityManager getEntityManager() {
        return this.em;
    }

    @Override
    public AlertSettingFilter getFilterInstance() {
        return new AlertSettingFilter();
    }

    @Override
    public <E> JPQLQuery<E> queryForFilter(EntityPath<? extends AlertSetting> pathToEntity, JPQLQuery<E> query,
                                           AlertSettingFilter filter) {
        var result = super.queryForFilter(pathToEntity, query, filter);
        var entityPath = new QAlertSetting(pathToEntity.toString());

        if (filter.getNameAR() != null) {
            result = result.where(entityPath.nameAr.eq(filter.getNameAR()));
        }
        if (filter.getNameEN() != null) {
            result = result.where(entityPath.nameEn.eq(filter.getNameEN()));
        }
        if (filter.getAlertTypeLookupId() != null) {
            result = result.where(entityPath.alertTypeLookupId.eq(filter.getAlertTypeLookupId()));
        }
        return result;
    }
}
