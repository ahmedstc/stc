package sa.com.stc.vms.backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.com.stc.common.controllers.BaseCRUDCustomController;
import sa.com.stc.vms.backend.dtos.ServiceCostDto;
import sa.com.stc.vms.backend.dtos.ServiceCostPostUpdateDto;
import sa.com.stc.vms.backend.filters.ServiceCostFilter;
import sa.com.stc.vms.backend.models.ServiceCost;
import sa.com.stc.vms.backend.services.IServiceCostService;

@RestController
@RequestMapping("/api/service-cost")
public class ServiceCostController extends
        BaseCRUDCustomController<ServiceCost, ServiceCostDto, ServiceCostPostUpdateDto, ServiceCostPostUpdateDto, ServiceCostFilter, IServiceCostService> {

    public ServiceCostController(IServiceCostService service) {
        super(service);
    }

    @Override
    public ServiceCostDto MapModelToModelDto(ServiceCost model) {
        return new ServiceCostDto(model);
    }

    @Override
    public ServiceCost MapPostDtoToModel(ServiceCostPostUpdateDto serviceCostPostUpdateDto) {
        return new ServiceCost(serviceCostPostUpdateDto);
    }

    @Override
    public ServiceCost MapUpdateDtoToModel(ServiceCostPostUpdateDto serviceCostPostUpdateDto) {
        return new ServiceCost(serviceCostPostUpdateDto);
    }
}
