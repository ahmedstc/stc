package sa.com.stc.vms.backend.services;

import org.springframework.stereotype.Service;
import sa.com.stc.common.services.IBaseCustomServiceImpl;
import sa.com.stc.vms.backend.filters.VehicleTypeAndPriceFilter;
import sa.com.stc.vms.backend.models.VehicleTypeAndPrice;
import sa.com.stc.vms.backend.repositories.IVehicleTypeAndPriceRepository;

@Service
public class IVehicleTypeAndPriceServiceImpl
        extends IBaseCustomServiceImpl<VehicleTypeAndPrice, VehicleTypeAndPriceFilter, IVehicleTypeAndPriceRepository>
        implements IVehicleTypeAndPriceService {

    public IVehicleTypeAndPriceServiceImpl(IVehicleTypeAndPriceRepository repository) {
        super(repository);
    }
}
