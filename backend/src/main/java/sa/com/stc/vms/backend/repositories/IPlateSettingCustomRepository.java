package sa.com.stc.vms.backend.repositories;

import sa.com.stc.common.repositories.IBaseCustomRepository;
import sa.com.stc.vms.backend.filters.PlateSettingFilter;
import sa.com.stc.vms.backend.models.PlateSetting;

public interface IPlateSettingCustomRepository extends IBaseCustomRepository<PlateSetting, PlateSettingFilter> {
}
