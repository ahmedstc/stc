package sa.com.stc.vms.backend.models;

import org.hibernate.annotations.Type;
import sa.com.stc.common.models.BaseModel;
import sa.com.stc.vms.backend.dtos.AlertSettingPostUpdateDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class AlertSetting extends BaseModel {
    @Column
    private String nameAr;
    @Column
    private String nameEn;
    @Column
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID alertTypeLookupId;

    public AlertSetting() {
    }

    public AlertSetting(UUID id) {
        super(id);
    }

    public AlertSetting(AlertSettingPostUpdateDto dto) {
        super(UUID.randomUUID());
        this.nameAr = dto.getNameAr();
        this.nameEn = dto.getNameEn();
        this.alertTypeLookupId = dto.getAlertTypeLookupId();
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public UUID getAlertTypeLookupId() {
        return alertTypeLookupId;
    }

    public void setAlertTypeLookupId(UUID alertTypeLookupId) {
        this.alertTypeLookupId = alertTypeLookupId;
    }
}
