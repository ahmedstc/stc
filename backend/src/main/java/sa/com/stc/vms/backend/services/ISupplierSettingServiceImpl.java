package sa.com.stc.vms.backend.services;

import org.springframework.stereotype.Service;
import sa.com.stc.common.services.IBaseCustomServiceImpl;
import sa.com.stc.vms.backend.filters.SupplierSettingFilter;
import sa.com.stc.vms.backend.models.SupplierSetting;
import sa.com.stc.vms.backend.repositories.ISupplierSettingRepository;

@Service
public class ISupplierSettingServiceImpl
        extends IBaseCustomServiceImpl<SupplierSetting, SupplierSettingFilter, ISupplierSettingRepository>
        implements ISupplierSettingService {

    public ISupplierSettingServiceImpl(ISupplierSettingRepository repository) {
        super(repository);
    }
}
