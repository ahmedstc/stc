package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import org.springframework.stereotype.Repository;
import sa.com.stc.common.repositories.IBaseCustomRepositoryImpl;
import sa.com.stc.vms.backend.filters.VehicleRequestFilter;
import sa.com.stc.vms.backend.models.VehicleRequest;
import sa.com.stc.vms.backend.models.QVehicleRequest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class IVehicleRequestCustomRepositoryImpl extends IBaseCustomRepositoryImpl<VehicleRequest, VehicleRequestFilter>
        implements IVehicleRequestCustomRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public EntityPath<VehicleRequest> getEntityPath() {
        return QVehicleRequest.vehicleRequest;
    }

    @Override
    public EntityManager getEntityManager() {
        return this.em;
    }

    @Override
    public VehicleRequestFilter getFilterInstance() {
        return new VehicleRequestFilter();
    }
}
