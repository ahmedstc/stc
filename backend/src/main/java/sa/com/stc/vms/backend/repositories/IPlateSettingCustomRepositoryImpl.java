package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import com.querydsl.jpa.JPQLQuery;
import org.springframework.stereotype.Repository;
import sa.com.stc.common.repositories.IBaseCustomRepositoryImpl;
import sa.com.stc.vms.backend.filters.PlateSettingFilter;
import sa.com.stc.vms.backend.models.PlateSetting;
import sa.com.stc.vms.backend.models.QPlateSetting;

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

    @Override
    public <E> JPQLQuery<E> queryForFilter(EntityPath<? extends PlateSetting> pathToEntity, JPQLQuery<E> query,
                                           PlateSettingFilter filter) {
        var result = super.queryForFilter(pathToEntity, query, filter);
        var entityPath = new QPlateSetting(pathToEntity.toString());

        if (filter.getAlternatives() != null) {
            result = result.where(entityPath.alternatives.eq(filter.getAlternatives()));
        }
        if (filter.getArabicChar() != null) {
            result = result.where(entityPath.arabicChar.eq(filter.getArabicChar()));
        }
        if (filter.getEnglishChar() != null) {
            result = result.where(entityPath.englishChar.eq(filter.getEnglishChar()));
        }
        return result;
    }
}
