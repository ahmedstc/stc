package sa.com.stc.vms.backend.repositories;

import sa.com.stc.common.repositories.IBaseCustomRepository;
import sa.com.stc.vms.backend.filters.VehicleTypeAndPriceFilter;
import sa.com.stc.vms.backend.models.VehicleTypeAndPrice;

public interface IVehicleTypeAndPriceCustomRepository extends IBaseCustomRepository<VehicleTypeAndPrice, VehicleTypeAndPriceFilter> {
}
