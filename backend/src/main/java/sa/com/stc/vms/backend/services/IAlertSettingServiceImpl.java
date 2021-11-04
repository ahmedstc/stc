package sa.com.stc.vms.backend.services;

import org.springframework.stereotype.Service;
import sa.com.stc.common.services.IBaseCustomServiceImpl;
import sa.com.stc.vms.backend.filters.AlertSettingFilter;
import sa.com.stc.vms.backend.models.AlertSetting;
import sa.com.stc.vms.backend.repositories.IAlertSettingRepository;

@Service
public class IAlertSettingServiceImpl
        extends IBaseCustomServiceImpl<AlertSetting, AlertSettingFilter, IAlertSettingRepository>
        implements IAlertSettingService {

    public IAlertSettingServiceImpl(IAlertSettingRepository repository) {
        super(repository);
    }
}
