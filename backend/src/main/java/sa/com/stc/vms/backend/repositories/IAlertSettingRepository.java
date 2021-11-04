package sa.com.stc.vms.backend.repositories;

import sa.com.stc.common.repositories.IBaseRepository;
import sa.com.stc.vms.backend.models.AlertSetting;

public interface IAlertSettingRepository extends IBaseRepository<AlertSetting>, IAlertSettingCustomRepository {
}
