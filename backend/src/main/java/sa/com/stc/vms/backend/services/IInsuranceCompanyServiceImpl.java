package sa.com.stc.vms.backend.services;

import org.springframework.stereotype.Service;
import sa.com.stc.common.services.IBaseCustomServiceImpl;
import sa.com.stc.vms.backend.filters.InsuranceCompanyFilter;
import sa.com.stc.vms.backend.models.InsuranceCompany;
import sa.com.stc.vms.backend.repositories.IInsuranceCompanyRepository;

@Service
public class IInsuranceCompanyServiceImpl
        extends IBaseCustomServiceImpl<InsuranceCompany, InsuranceCompanyFilter, IInsuranceCompanyRepository>
        implements IInsuranceCompanyService {

    public IInsuranceCompanyServiceImpl(IInsuranceCompanyRepository repository) {
        super(repository);
    }
}
