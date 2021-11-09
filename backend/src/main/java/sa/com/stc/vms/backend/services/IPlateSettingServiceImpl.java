package sa.com.stc.vms.backend.services;

import org.springframework.stereotype.Service;
import sa.com.stc.common.services.IBaseCustomServiceImpl;
import sa.com.stc.vms.backend.filters.PlateSettingFilter;
import sa.com.stc.vms.backend.models.PlateSetting;
import sa.com.stc.vms.backend.repositories.IPlateSettingRepository;

@Service
public class IPlateSettingServiceImpl
        extends IBaseCustomServiceImpl<PlateSetting, PlateSettingFilter, IPlateSettingRepository>
        implements IPlateSettingService {

    public IPlateSettingServiceImpl(IPlateSettingRepository repository) {
        super(repository);
    }
}
