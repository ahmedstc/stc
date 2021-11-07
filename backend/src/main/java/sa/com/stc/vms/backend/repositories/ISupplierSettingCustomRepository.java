package sa.com.stc.vms.backend.repositories;

import sa.com.stc.common.repositories.IBaseCustomRepository;
import sa.com.stc.vms.backend.filters.SupplierSettingFilter;
import sa.com.stc.vms.backend.models.SupplierSetting;

public interface ISupplierSettingCustomRepository extends IBaseCustomRepository<SupplierSetting, SupplierSettingFilter> {
}
