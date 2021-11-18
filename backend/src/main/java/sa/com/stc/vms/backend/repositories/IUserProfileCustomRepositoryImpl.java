package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import com.querydsl.jpa.JPQLQuery;
import org.springframework.stereotype.Repository;
import sa.com.stc.common.repositories.IBaseCustomRepositoryImpl;
import sa.com.stc.vms.backend.filters.UserProfileFilter;
import sa.com.stc.vms.backend.models.QUserProfile;
import sa.com.stc.vms.backend.models.UserProfile;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class IUserProfileCustomRepositoryImpl extends IBaseCustomRepositoryImpl<UserProfile, UserProfileFilter>
        implements IUserProfileCustomRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public EntityPath<UserProfile> getEntityPath() {
        return QUserProfile.userProfile;
    }

    @Override
    public EntityManager getEntityManager() {
        return this.em;
    }

    @Override
    public UserProfileFilter getFilterInstance() {
        return new UserProfileFilter();
    }

    @Override
    public <E> JPQLQuery<E> queryForFilter(EntityPath<? extends UserProfile> pathToEntity, JPQLQuery<E> query,
                                           UserProfileFilter filter) {
        var result = super.queryForFilter(pathToEntity, query, filter);
        var entityPath = new QUserProfile(pathToEntity.toString());

        if (filter.getNameAR() != null) {
            result = result.where(entityPath.nameAr.eq(filter.getNameAR()));
        }
        if (filter.getNameEN() != null) {
            result = result.where(entityPath.nameAr.eq(filter.getNameAR()));
        }
        return result;
    }
}
