package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sa.com.stc.common.repositories.IBaseCustomRepositoryImpl;
import sa.com.stc.vms.backend.filters.InsuranceCompanyFilter;
import sa.com.stc.vms.backend.models.QInsuranceCompany;
import sa.com.stc.vms.backend.models.InsuranceCompany;

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
}
