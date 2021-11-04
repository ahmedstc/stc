package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
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
}
