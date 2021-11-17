package sa.com.stc.vms.backend.services;

import org.springframework.stereotype.Service;
import sa.com.stc.common.services.IBaseCustomServiceImpl;
import sa.com.stc.vms.backend.filters.VehicleRequestFilter;
import sa.com.stc.vms.backend.models.VehicleRequest;
import sa.com.stc.vms.backend.repositories.IVehicleRequestRepository;

@Service
public class IVehicleRequestServiceImpl
        extends IBaseCustomServiceImpl<VehicleRequest, VehicleRequestFilter, IVehicleRequestRepository>
        implements IVehicleRequestService {

    public IVehicleRequestServiceImpl(IVehicleRequestRepository repository) {
        super(repository);
    }
}
