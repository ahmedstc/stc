package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import org.springframework.stereotype.Repository;
import sa.com.stc.common.repositories.IBaseCustomRepositoryImpl;
import sa.com.stc.vms.backend.filters.PlateSettingFilter;
import sa.com.stc.vms.backend.models.QPlateSetting;
import sa.com.stc.vms.backend.models.PlateSetting;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class IPlateSettingCustomRepositoryImpl extends IBaseCustomRepositoryImpl<PlateSetting, PlateSettingFilter>
        implements IPlateSettingCustomRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public EntityPath<PlateSetting> getEntityPath() {
        return QPlateSetting.plateSetting;
    }

    @Override
    public EntityManager getEntityManager() {
        return this.em;
    }

    @Override
    public PlateSettingFilter getFilterInstance() {
        return new PlateSettingFilter();
    }
}
