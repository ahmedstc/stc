package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import com.querydsl.jpa.JPQLQuery;
import org.springframework.stereotype.Repository;
import sa.com.stc.common.repositories.IBaseCustomRepositoryImpl;
import sa.com.stc.vms.backend.filters.InsuranceCompanyFilter;
import sa.com.stc.vms.backend.models.InsuranceCompany;
import sa.com.stc.vms.backend.models.QInsuranceCompany;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class IInsuranceCompanyCustomRepositoryImpl extends IBaseCustomRepositoryImpl<InsuranceCompany, InsuranceCompanyFilter>
        implements IInsuranceCompanyCustomRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public EntityPath<InsuranceCompany> getEntityPath() {
        return QInsuranceCompany.insuranceCompany;
    }

    @Override
    public EntityManager getEntityManager() {
        return this.em;
    }

    @Override
    public InsuranceCompanyFilter getFilterInstance() {
        return new InsuranceCompanyFilter();
    }

    @Override
    public <E> JPQLQuery<E> queryForFilter(EntityPath<? extends InsuranceCompany> pathToEntity, JPQLQuery<E> query,
                                           InsuranceCompanyFilter filter) {
        var result = super.queryForFilter(pathToEntity, query, filter);
        var entityPath = new QInsuranceCompany(pathToEntity.toString());

        if (filter.getNameAR() != null) {
            result = result.where(entityPath.nameAr.eq(filter.getNameAR()));
        }
        if (filter.getNameEN() != null) {
            result = result.where(entityPath.nameEn.eq(filter.getNameEN()));
        }
        if (filter.getEmail() != null) {
            result = result.where(entityPath.email.eq(filter.getEmail()));
        }
        return result;
    }
}
