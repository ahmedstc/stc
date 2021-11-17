package sa.com.stc.vms.backend.repositories;

import com.querydsl.core.types.EntityPath;
import com.querydsl.jpa.JPQLQuery;
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

    @Override
    public <E> JPQLQuery<E> queryForFilter(EntityPath<? extends VehicleRequest> pathToEntity, JPQLQuery<E> query,
                                           VehicleRequestFilter filter) {
        var result = super.queryForFilter(pathToEntity, query, filter);
        var entityPath = new QVehicleRequest(pathToEntity.toString());

        if (filter.getRequestNumber() != null) {
            result = result.where(entityPath.requestNumber.eq(filter.getRequestNumber()));
        }
        if (filter.getRequestName() != null) {
            result = result.where(entityPath.requestName.eq(filter.getRequestName()));
        }
        if (filter.getRequestStatus() != null) {
            result = result.where(entityPath.requestStatus.eq(filter.getRequestStatus()));
        }
        if (filter.getCreatedById() != null) {
            result = result.where(entityPath.createdBy.eq(filter.getCreatedById()));
        }
        if (filter.getCreationDate() != null) {
            result = result.where(entityPath.createdOn.eq(filter.getCreationDate()));
        }
        return result;
    }
}
