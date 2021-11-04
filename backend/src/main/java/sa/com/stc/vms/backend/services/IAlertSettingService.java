package sa.com.stc.vms.backend.services;

import sa.com.stc.common.services.IBaseCustomService;
import sa.com.stc.vms.backend.filters.AlertSettingFilter;
import sa.com.stc.vms.backend.models.AlertSetting;

public interface IAlertSettingService extends IBaseCustomService<AlertSetting, AlertSettingFilter> {
}
