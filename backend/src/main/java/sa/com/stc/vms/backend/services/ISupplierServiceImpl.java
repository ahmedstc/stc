package sa.com.stc.vms.backend.services;

import org.springframework.stereotype.Service;
import sa.com.stc.common.services.IBaseCustomServiceImpl;
import sa.com.stc.vms.backend.filters.SupplierFilter;
import sa.com.stc.vms.backend.models.Supplier;
import sa.com.stc.vms.backend.repositories.ISupplierRepository;

@Service
public class ISupplierServiceImpl
        extends IBaseCustomServiceImpl<Supplier, SupplierFilter, ISupplierRepository>
        implements ISupplierService {

    public ISupplierServiceImpl(ISupplierRepository repository) {
        super(repository);
    }
}
