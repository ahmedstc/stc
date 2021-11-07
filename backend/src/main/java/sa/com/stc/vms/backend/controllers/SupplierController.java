package sa.com.stc.vms.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.com.stc.common.controllers.BaseCRUDCustomController;
import sa.com.stc.vms.backend.dtos.SupplierDto;
import sa.com.stc.vms.backend.dtos.SupplierPostUpdateDto;
import sa.com.stc.vms.backend.filters.SupplierFilter;
import sa.com.stc.vms.backend.models.Supplier;
import sa.com.stc.vms.backend.services.ISupplierService;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController extends
        BaseCRUDCustomController<Supplier, SupplierDto, SupplierPostUpdateDto, SupplierPostUpdateDto, SupplierFilter, ISupplierService> {

    @Autowired
    ISupplierService iSupplierService;

    public SupplierController(ISupplierService service) {
        super(service);
    }

    @Override
    public SupplierDto MapModelToModelDto(Supplier model) {
        return new SupplierDto(model);
    }

    @Override
    public Supplier MapPostDtoToModel(SupplierPostUpdateDto supplierPostUpdateDto) {
        return new Supplier(supplierPostUpdateDto);
    }

    @Override
    public Supplier MapUpdateDtoToModel(SupplierPostUpdateDto supplierPostUpdateDto) {
        return new Supplier(supplierPostUpdateDto);
    }
}
