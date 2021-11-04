package sa.com.stc.vms.backend.services;

import sa.com.stc.common.services.IBaseCustomService;
import sa.com.stc.vms.backend.filters.SupplierFilter;
import sa.com.stc.vms.backend.models.Supplier;

public interface ISupplierService extends IBaseCustomService<Supplier, SupplierFilter> {
}
