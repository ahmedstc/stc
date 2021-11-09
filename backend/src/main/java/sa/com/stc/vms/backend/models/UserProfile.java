package sa.com.stc.vms.backend.models;

import sa.com.stc.common.models.BaseModel;
import sa.com.stc.vms.backend.dtos.AlertSettingPostUpdateDto;
import sa.com.stc.vms.backend.dtos.UserProfilePostUpdateDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class UserProfile extends BaseModel {
    @Column
    private String nameAr;
    @Column
    private String nameEn;

    public UserProfile() {
    }

    public UserProfile(UUID id) {
        super(id);
    }

    public UserProfile(UserProfilePostUpdateDto dto) {
        super(UUID.randomUUID());
        this.nameAr = dto.getNameAr();
        this.nameEn = dto.getNameEn();
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
}
