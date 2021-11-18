package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import com.querydsl.jpa.JPQLQuery;
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

    @Override
    public <E> JPQLQuery<E> queryForFilter(EntityPath<? extends VehicleTypeAndPrice> pathToEntity, JPQLQuery<E> query,
                                           VehicleTypeAndPriceFilter filter) {
        var result = super.queryForFilter(pathToEntity, query, filter);
        var entityPath = new QVehicleTypeAndPrice(pathToEntity.toString());

        if (filter.getVehicleTypeLookupId() != null) {
            result = result.where(entityPath.vehicleTypeLookupId.eq(filter.getVehicleTypeLookupId()));
        }
        if (filter.getPriceSegmentLookupId() != null) {
            result = result.where(entityPath.priceSegmentLookupId.eq(filter.getPriceSegmentLookupId()));
        }
        if (filter.getPriceStatusLookupId() != null) {
            result = result.where(entityPath.priceStatusLookupId.eq(filter.getPriceStatusLookupId()));
        }
        if (filter.getDailyRentForPriceSegment() != null) {
            result = result.where(entityPath.dailyRentForPriceSegment.eq(filter.getDailyRentForPriceSegment()));
        }
        if (filter.getVehicleRequestId() != null) {
            result = result.where(entityPath.vehicleRequestId.eq(filter.getVehicleRequestId()));
        }
        return result;
    }
}
