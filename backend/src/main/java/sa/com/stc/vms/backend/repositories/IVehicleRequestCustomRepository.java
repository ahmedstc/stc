package sa.com.stc.vms.backend.repositories;

import sa.com.stc.common.repositories.IBaseCustomRepository;
import sa.com.stc.vms.backend.filters.VehicleRequestFilter;
import sa.com.stc.vms.backend.models.VehicleRequest;

public interface IVehicleRequestCustomRepository extends IBaseCustomRepository<VehicleRequest, VehicleRequestFilter> {
}
