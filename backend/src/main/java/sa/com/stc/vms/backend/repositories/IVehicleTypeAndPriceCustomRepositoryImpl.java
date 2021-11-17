package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import org.springframework.stereotype.Repository;
import sa.com.stc.common.repositories.IBaseCustomRepositoryImpl;
import sa.com.stc.vms.backend.filters.VehicleTypeAndPriceFilter;
import sa.com.stc.vms.backend.models.QVehicleTypeAndPrice;
import sa.com.stc.vms.backend.models.VehicleTypeAndPrice;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class IVehicleTypeAndPriceCustomRepositoryImpl extends IBaseCustomRepositoryImpl<VehicleTypeAndPrice, VehicleTypeAndPriceFilter>
        implements IVehicleTypeAndPriceCustomRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public EntityPath<VehicleTypeAndPrice> getEntityPath() {
        return QVehicleTypeAndPrice.vehicleTypeAndPrice;
    }

    @Override
    public EntityManager getEntityManager() {
        return this.em;
    }

    @Override
    public VehicleTypeAndPriceFilter getFilterInstance() {
        return new VehicleTypeAndPriceFilter();
    }
}
