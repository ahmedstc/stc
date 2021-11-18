package sa.com.stc.vms.backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.com.stc.common.controllers.BaseCRUDCustomController;
import sa.com.stc.vms.backend.dtos.InsuranceCompanyDto;
import sa.com.stc.vms.backend.dtos.InsuranceCompanyPostUpdateDto;
import sa.com.stc.vms.backend.filters.InsuranceCompanyFilter;
import sa.com.stc.vms.backend.models.InsuranceCompany;
import sa.com.stc.vms.backend.services.IInsuranceCompanyService;

@RestController
@RequestMapping("/api/insurance-company")
public class InsuranceCompanyController extends
        BaseCRUDCustomController<InsuranceCompany, InsuranceCompanyDto, InsuranceCompanyPostUpdateDto, InsuranceCompanyPostUpdateDto, InsuranceCompanyFilter, IInsuranceCompanyService> {

    public InsuranceCompanyController(IInsuranceCompanyService service) {
        super(service);
    }

    @Override
    public InsuranceCompanyDto MapModelToModelDto(InsuranceCompany model) {
        return new InsuranceCompanyDto(model);
    }

    @Override
    public InsuranceCompany MapPostDtoToModel(InsuranceCompanyPostUpdateDto insuranceCompanyPostUpdateDto) {
        return new InsuranceCompany(insuranceCompanyPostUpdateDto);
    }

    @Override
    public InsuranceCompany MapUpdateDtoToModel(InsuranceCompanyPostUpdateDto insuranceCompanyPostUpdateDto) {
        return new InsuranceCompany(insuranceCompanyPostUpdateDto);
    }
}
