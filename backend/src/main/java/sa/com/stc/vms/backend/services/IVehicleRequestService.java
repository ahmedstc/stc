package sa.com.stc.vms.backend.services;

import sa.com.stc.common.services.IBaseCustomService;
import sa.com.stc.vms.backend.filters.VehicleRequestFilter;
import sa.com.stc.vms.backend.models.VehicleRequest;

public interface IVehicleRequestService extends IBaseCustomService<VehicleRequest, VehicleRequestFilter> {
}
