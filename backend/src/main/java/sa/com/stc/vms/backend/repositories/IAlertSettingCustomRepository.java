package sa.com.stc.vms.backend.repositories;

import sa.com.stc.common.repositories.IBaseCustomRepository;
import sa.com.stc.vms.backend.filters.AlertSettingFilter;
import sa.com.stc.vms.backend.models.AlertSetting;

public interface IAlertSettingCustomRepository extends IBaseCustomRepository<AlertSetting, AlertSettingFilter> {
}
