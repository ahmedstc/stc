package sa.com.stc.vms.backend.repositories;

import sa.com.stc.common.repositories.IBaseCustomRepository;
import sa.com.stc.vms.backend.filters.InsuranceCompanyFilter;
import sa.com.stc.vms.backend.models.InsuranceCompany;

public interface IInsuranceCompanyCustomRepository  extends IBaseCustomRepository<InsuranceCompany, InsuranceCompanyFilter> {
}
