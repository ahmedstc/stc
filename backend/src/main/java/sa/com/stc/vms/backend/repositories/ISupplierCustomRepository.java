package sa.com.stc.vms.backend.repositories;

import sa.com.stc.common.repositories.IBaseCustomRepository;
import sa.com.stc.vms.backend.filters.SupplierFilter;
import sa.com.stc.vms.backend.models.Supplier;

public interface ISupplierCustomRepository extends IBaseCustomRepository<Supplier, SupplierFilter> {
}
