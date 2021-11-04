package sa.com.stc.vms.backend.repositories;

import sa.com.stc.common.repositories.IBaseRepository;
import sa.com.stc.vms.backend.models.InsuranceCompany;

public interface IInsuranceCompanyRepository extends IBaseRepository<InsuranceCompany>, IInsuranceCompanyCustomRepository {
}
