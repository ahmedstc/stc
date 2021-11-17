package sa.com.stc.vms.backend.services;

import sa.com.stc.common.services.IBaseCustomService;
import sa.com.stc.vms.backend.filters.VehicleTypeAndPriceFilter;
import sa.com.stc.vms.backend.models.VehicleTypeAndPrice;

public interface IVehicleTypeAndPriceService extends IBaseCustomService<VehicleTypeAndPrice, VehicleTypeAndPriceFilter> {
}
