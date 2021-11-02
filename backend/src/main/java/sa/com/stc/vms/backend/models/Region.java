package sa.com.stc.vms.backend.models;

import sa.com.stc.common.models.BaseModel;
import sa.com.stc.vms.backend.dtos.RegionPostUpdateDto;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "vms_region")
public class Region extends BaseModel {

    public Region(RegionPostUpdateDto regionPostUpdateDto) {
        super(UUID.randomUUID());
    }
}
